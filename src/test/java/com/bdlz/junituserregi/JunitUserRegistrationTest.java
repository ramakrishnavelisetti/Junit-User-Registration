package com.bdlz.junituserregi;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class JunitUserRegistrationTest {
    JunitUserRegistration junitUserRegistration = new JunitUserRegistration();

    @Test
    public void givenFirstName_IsProper_ReturnTrue() {
        boolean actualResult = junitUserRegistration.firstName("Ramakrishna");
        Assert.assertEquals(true, actualResult);
    }

    @Test
    public void givenFirstName_IsProper_ReturnFalse() {
        boolean actualResult = junitUserRegistration.firstName("RamaKrishna");
        Assert.assertEquals(false, actualResult);
    }
}