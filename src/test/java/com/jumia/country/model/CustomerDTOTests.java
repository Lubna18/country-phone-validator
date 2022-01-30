package com.jumia.country.model;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CustomerDTOTests {

    private CustomerDTO customerDTO;

    @BeforeEach
    public void init() {
        customerDTO = new CustomerDTO();
        customerDTO.setId(1);
        customerDTO.setName("Lubna");
        customerDTO.setPhone("23456");
    }

    @Test
    public void setterAndGetters_Success() {
        Assert.assertEquals(1, customerDTO.getId());
        Assert.assertEquals("Lubna", customerDTO.getName());
        Assert.assertNotNull(customerDTO.toString());
    }

}
