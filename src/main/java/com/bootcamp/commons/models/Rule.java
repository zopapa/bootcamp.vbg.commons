package com.bootcamp.commons.models;

import com.bootcamp.commons.annotations.NativeQueryResultColumn;
import com.bootcamp.commons.utils.NativeQueryResultsMapper;

import java.lang.reflect.Field;

/**
 * Created by darextossa on 11/19/17.
 */
public class Rule {

    private String column;
    private String operator;
    private Object value;
    private Class entityClass;

    public Rule() {
    }

    public Rule(String column, String operator, Object value) {
        this.column = column;
        this.operator = operator;
        this.value = value;
    }

    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public String getAsStringQuery(String entityPrefix) {
        if(entityClass != null){
            if(isNumericField())
                return entityPrefix + "." + column + " " + operator + " " + value + " ";
        }
        return entityPrefix + "." + column + " " + operator + " '" + value + "'";
    }

    public Boolean isNumericField(){
        Field field = NativeQueryResultsMapper.getFieldByName(column, entityClass);
        Class fieldClass = field.getType();
        if(fieldClass == int.class ||
                fieldClass == double.class ||
                fieldClass == long.class )
            return true;

        return false;
    }


    public Class getEntityClass() {
        return entityClass;
    }

    public void setEntityClass(Class entityClass) {
        this.entityClass = entityClass;
    }
}
