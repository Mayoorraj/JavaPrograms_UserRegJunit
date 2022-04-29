package com.bridgelabz.userregitest;

import com.bridgelabz.assignment20.InfoValidation;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

    //    Happy Test for first name, first letter - capital letter
    @Test
    public void firstNameHappyTest() {

        InfoValidation validator = new InfoValidation();
        boolean happyTest = validator.validName("Mayoor");
        Assert.assertTrue(happyTest);
    }

    //    Sad Test for first name, first letter - capital letter

    @Test
    public void firstNameSadTest1() {

        InfoValidation validator = new InfoValidation();
        boolean sadTest = validator.validName("mayoor");
        Assert.assertFalse(sadTest);
    }

    //    Sad Test for first name, first letter - capital letter

    @Test
    public void firstNameSadTest2() {

        InfoValidation validator = new InfoValidation();
        boolean sadTest = validator.validName("ma");
        Assert.assertFalse(sadTest);
    }

//    Happy Test for last name, first letter - capital letter

    @Test
    public void lastNameHappyTest() {

        InfoValidation validator = new InfoValidation();
        boolean happyTest = validator.validName("Doiphode");
        Assert.assertTrue(happyTest);
    }

    //    Sad Test for last name, first letter - capital letter

    @Test
    public void lastNameSadTest1() {

        InfoValidation validator = new InfoValidation();
        boolean sadTest = validator.validName("doiphode");
        Assert.assertFalse(sadTest);
    }

    //    Sad Test for last name, first letter - capital letter

    @Test
    public void lastNameSadTest2() {

        InfoValidation validator = new InfoValidation();
        boolean sadTest = validator.validName("Do");
        Assert.assertFalse(sadTest);

    }

    //    Sad Test for last name, first letter - capital letter

    @Test
    public void emailHappyTest() {

        InfoValidation validator = new InfoValidation();
        boolean happyTest = validator.validEmail("mayoordoiphode@bl.co.in");
        Assert.assertTrue(happyTest);

    }

    @Test
    public void emailSadTest() {

        InfoValidation validator = new InfoValidation();
        boolean sadTest = validator.validEmail("mayoordoiphodebl.co.in");
        Assert.assertFalse(sadTest);

    }

    @Test
    public void mobNoHappyTest() {

        InfoValidation userValidator = new InfoValidation();
        boolean happyTest = userValidator.validMobNo("91 8600745987");
        Assert.assertTrue(happyTest);
    }

    @Test
    public void mobNoSadTest1() {

        InfoValidation userValidator = new InfoValidation();
        boolean sadTest = userValidator.validMobNo("918600745987");
        Assert.assertFalse(sadTest);
    }

    @Test
    public void mobNoSadTest2() {

        InfoValidation userValidator = new InfoValidation();
        boolean sadTest = userValidator.validMobNo("91 8600745");
        Assert.assertFalse(sadTest);
    }

    @Test
    public void passwordHappyTest() {

        InfoValidation validator = new InfoValidation();
        boolean isValid = validator.validPwd("Dr8%vdslnl");
        Assert.assertTrue(isValid);
    }

    @Test
    public void passwordSadTest1() {

        InfoValidation validator = new InfoValidation();
        boolean sadTest = validator.validPwd("sd@A12");
        Assert.assertFalse(sadTest);
    }

    @Test
    public void passwordSadTest2() {

        InfoValidation validator = new InfoValidation();
        boolean sadTest = validator.validPwd("asjd23$df");
        Assert.assertFalse(sadTest);
    }

    @Test
    public void passwordSadTest3() {

        InfoValidation validator = new InfoValidation();
        boolean sadTest = validator.validPwd("asjdAG$df");
        Assert.assertFalse(sadTest);
    }

    @Test
    public void passwordSadTest4() {

        InfoValidation validator = new InfoValidation();
        boolean sadTest = validator.validPwd("asjd23^$df");
        Assert.assertFalse(sadTest);
    }
}