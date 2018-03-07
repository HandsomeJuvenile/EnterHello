package com.redhat.helloworld.test;

import com.redhat.helloworld.service.UserService;

public class RegisterTest {


    public static void main(String[] args) {
        try {
            UserService userService = new UserService();
            boolean isTrue = userService.login("zzh","111111");
            System.out.println(isTrue);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
