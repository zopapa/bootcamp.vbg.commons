package com.bootcamp.commons.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by darextossa on 11/20/17.
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface NativeQueryResultColumn {

    public enum COLUMNTYPE {
        SIMPLE, COMPLEX
        //LIST
    }

    COLUMNTYPE columnType() default COLUMNTYPE.SIMPLE;
    //Class classReference() default String.class;

}
