package com.bootcamp.commons.utils;

import java.io.IOException;
import com.google.gson.*;
import java.io.Reader;
import java.lang.reflect.Type;

/**
 * Created by darextossa on 11/27/17.
 */
public class GsonUtils {

    public static <T> T getObjectFromJson(String json, Class<T> theClass) throws IOException {
        Gson gson = new GsonBuilder().enableComplexMapKeySerialization().create();
        return gson.fromJson(json, theClass);
    }

    public static <T> T getObjectFromJson(String json, Type type) throws IOException {
        Gson gson = new GsonBuilder().enableComplexMapKeySerialization().create();
        return gson.fromJson(json, type);
    }

    public static <T> T fromJSON(Reader reader, Class<T> theClass) throws IOException {
        return new Gson().fromJson(reader, theClass);
    }

    public static <T> T fromJSON(Reader reader, Type type) throws IOException {
        return new Gson().fromJson(reader, type);
    }

    public static String toJSONWithoutClassName(Object object) {
        Gson gson = new GsonBuilder().enableComplexMapKeySerialization().setPrettyPrinting().create();
        return gson.toJson(object);
    }


}
