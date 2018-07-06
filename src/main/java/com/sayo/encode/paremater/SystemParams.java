package com.sayo.encode.paremater;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SystemParams {

    @Value("${userName}")
    private static String userName;
    @Value("${userPassword}")
    private static String password;

    public static String getUserName() {
        return userName;
    }

    public static void setUserName(String userName) {
        SystemParams.userName = userName;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        SystemParams.password = password;
    }
}
