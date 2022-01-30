package com.jumia.country.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PhoneTest {

    private Phone phone;

    @Before
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
