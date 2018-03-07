package com.redhat.helloworld;

import com.ly.ssm.service.UserService;
import com.redhat.helloworld.entity.Gun;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.web3j.crypto.CipherException;

import java.io.IOException;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    public void test(){
        Gun gun = new Gun();
        gun.setHarm("60b");
        gun.setName("M4");
        gun.setParts("满配");
        gun.setType("步枪");
        gun.setRange("500m");

        System.out.println(gun.toString());
    }

    public void registerTest(){
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


}
