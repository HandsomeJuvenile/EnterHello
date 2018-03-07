package com.ly.ssm.test;

import com.ly.ssm.service.UserService;
import org.web3j.crypto.CipherException;

import java.io.IOException;

public class Test {

    protected void register(){
        String username = "bxc";
        String password = "111111";
        String adress = "0xEc8dEF0715C776c872B827DFD8cEeC354fc2A5E6";
        System.out.println(username+password+adress);
        UserService userService = null;
        try {
            userService = new UserService();
            if(userService.Register(adress,username,password)){
                System.out.println("success");
            }
            else { System.out.println("wrongRegister"); }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void login(){
        String username = "zzh";
        String password = "111111333";
        System.out.println(username+password);
        UserService userService = null;
        try {
            userService = new UserService();
            if(userService.login(username,password)){
                System.out.println("success");
            }
            else { System.out.println("wrongPass");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (CipherException e) {
            e.printStackTrace();
        }catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws Exception {
        Test test = new Test();
        test.login();
    }
}
