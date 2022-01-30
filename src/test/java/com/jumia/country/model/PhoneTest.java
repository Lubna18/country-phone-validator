package com.jumia.country.model;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PhoneTest {

    private Phone phone;

    @BeforeEach
    public void init(){
        phone = new Phone("34567","Egypt","Valid","002");
    }

    @Test
    public void settersGetterSucess(){
        Assert.assertNotNull(phone);
        Assert.assertEquals(phone.getCountry(),"Egypt");
        Assert.assertEquals(phone.getCountryCode(),"002");
    }
}
