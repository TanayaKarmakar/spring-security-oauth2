package com.app.oauth2.common;

public class IdGenerator {
    public static Long id = Long.valueOf(0);

    public static Long getNextId() {
        id++;
        return id;
    }
}
