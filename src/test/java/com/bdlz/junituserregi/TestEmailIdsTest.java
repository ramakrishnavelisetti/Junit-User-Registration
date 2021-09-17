package com.bdlz.junituserregi;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestEmailIdsTest {
    TestEmailIds testEmailIds = new TestEmailIds();

    @Test
    public void givenEmailId1_IsProper_ReturnTrue() {
        boolean actualResult = testEmailIds.testForValidEmails("abc@yahoo.com");
        Assert.assertEquals(true, actualResult);
    }

    @Test
    public void givenEmailId2_IsProper_ReturnTrue() {
        boolean actualResult = testEmailIds.testForValidEmails("abc-100@yahoo.com");
        Assert.assertEquals(true, actualResult);
    }

    @Test
    public void givenEmailId3_IsProper_ReturnTrue() {
        boolean actualResult = testEmailIds.testForValidEmails("abc.100@yahoo.com");
        Assert.assertEquals(true, actualResult);
    }

    @Test
    public void givenEmailId4_IsProper_ReturnTrue() {
        boolean actualResult = testEmailIds.testForValidEmails("abc111@abc.com");
        Assert.assertEquals(true, actualResult);
    }

    @Test
    public void givenEmailId5_IsProper_ReturnTrue() {
        boolean actualResult = testEmailIds.testForValidEmails("abc-100@abc.net");
        Assert.assertEquals(true, actualResult);
    }

    @Test
    public void givenEmailId6_IsProper_ReturnTrue() {
        boolean actualResult = testEmailIds.testForValidEmails("abc.100@abc.com.au");
        Assert.assertEquals(true, actualResult);
    }

    @Test
    public void givenEmailId7_IsProper_ReturnTrue() {
        boolean actualResult = testEmailIds.testForValidEmails("abc@1.com");
        Assert.assertEquals(true, actualResult);
    }

    @Test
    public void givenEmailId8_IsProper_ReturnTrue() {
        boolean actualResult = testEmailIds.testForValidEmails("abc@gmail.com.com");
        Assert.assertEquals(true, actualResult);
    }

    @Test
    public void givenEmailId9_IsProper_ReturnTrue() {
        boolean actualResult = testEmailIds.testForValidEmails("abc+100@gmail.com");
        Assert.assertEquals(true, actualResult);
    }

    @Test
    public void givenEmilId1_IsNotProper_ReturnFalse() {
        boolean actualResult = testEmailIds.testForNonValidEmails("abc");
        Assert.assertEquals(false, actualResult);
    }
    @Test
    public void givenEmilId2_IsNotProper_ReturnFalse() {
        boolean actualResult = testEmailIds.testForNonValidEmails("abc@.com.my");
        Assert.assertEquals(false, actualResult);
    }
    @Test
    public void givenEmilId3_IsNotProper_ReturnFalse() {
        boolean actualResult = testEmailIds.testForNonValidEmails("abc123@gmail.a");
        Assert.assertEquals(false, actualResult);
    }
    @Test
    public void givenEmilId4_IsNotProper_ReturnFalse() {
        boolean actualResult = testEmailIds.testForNonValidEmails("abc123@.com");
        Assert.assertEquals(false, actualResult);
    }
    @Test
    public void givenEmilId5_IsNotProper_ReturnFalse() {
        boolean actualResult = testEmailIds.testForNonValidEmails("abc123@.com.com");
        Assert.assertEquals(false, actualResult);
    }
    @Test
    public void givenEmilIds6_IsNotProper_ReturnFalse() {
        boolean actualResult = testEmailIds.testForNonValidEmails(".abc@abc.com");
        Assert.assertEquals(false, actualResult);
    }
    @Test
    public void givenEmilId7_IsNotProper_ReturnFalse() {
        boolean actualResult = testEmailIds.testForNonValidEmails("abc()*@gmail.com");
        Assert.assertEquals(false, actualResult);
    }
    @Test
    public void givenEmilId8_IsNotProper_ReturnFalse() {
        boolean actualResult = testEmailIds.testForNonValidEmails("abc@%*.com");
        Assert.assertEquals(false, actualResult);
    }
    @Test
    public void givenEmilId9_IsNotProper_ReturnFalse() {
        boolean actualResult = testEmailIds.testForNonValidEmails("abc..2002@gmail.com");
        Assert.assertEquals(false, actualResult);
    }
    @Test
    public void givenEmilId10_IsNotProper_ReturnFalse() {
        boolean actualResult = testEmailIds.testForNonValidEmails("abc.@gmail.com");
        Assert.assertEquals(false, actualResult);
    }
    @Test
    public void givenEmilId11_IsNotProper_ReturnFalse() {
        boolean actualResult = testEmailIds.testForNonValidEmails("abc@abc@gmail.com");
        Assert.assertEquals(false, actualResult);
    }
    @Test
    public void givenEmilId12_IsNotProper_ReturnFalse() {
        boolean actualResult = testEmailIds.testForNonValidEmails("abc@gmail.com.1a");
        Assert.assertEquals(false, actualResult);
    }
    @Test
    public void givenEmilId13_IsNotProper_ReturnFalse() {
        boolean actualResult = testEmailIds.testForNonValidEmails("abc@gmail.com.aa.au");
        Assert.assertEquals(false, actualResult);
    }

}