package com.bridgelabz.JunitTestingForUserRegistration;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class UserRegistrationDetailsTest 
{
    UserRegistration user= new UserRegistration();
    
    @Test
    public void testFirstName(){
        String fName = "Geeta";
        boolean check = user.firstNameCheck(fName);
        assertTrue( check);
    }

    @Test
    public void testLastName(){
        String lName = "Math";
        boolean chek = user.lastNameCheck(lName);
        assertTrue( chek);
    }

    @Test
    public void testEmail(){
        String eMail = "abc.xyz@bl.co.in";
        boolean chek = user.email(eMail);
        assertTrue( chek);
    }

    @Test
    public void testMobileNum(){
        String mobile = "91 9533182605";
        boolean chek = user.mobileNum(mobile);
        assertTrue( chek);
    }

    @Test
    public void testPassWordRule1(){
        String pass = "geetamath";
        boolean chek = user.passWordRule1(pass);
        assertTrue( chek);
    }

    @Test
    public void testPassWordRule2(){
        String pass = "Geetasmath";
        boolean chek = user.passWordRule2(pass);
        assertTrue( chek);
    }


    @Test
    public void testPassWordRule3(){
        String pass = "Geetamaths1";
        boolean chek = user.passWordRule3(pass);
        assertTrue( chek);
    }

    @Test
    public void testPassWordRule4(){
        String pass = "Geetamath1@";
        boolean chek = user.passWordRule4(pass);
        assertTrue( chek);
    }


}