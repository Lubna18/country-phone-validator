package com.jumia.country.service;

import com.jumia.country.model.CustomerDAO;
import com.jumia.country.model.Phone;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class PhoneServiceTest {

    @InjectMocks
    private PhoneService phoneService;

    @InjectMocks
    private CustomerDAO customerDAO;

    @Test
    public void validatePhoneNumbersTest(){
        List<String> phoneList = new ArrayList<>();
        phoneList.add("(212) 6007989253");
        phoneList.add("(258) 849181828");
        phoneList.add("(237) 677046616");
        Mockito.when(customerDAO.fetchPhoneNumbers()).thenReturn(phoneList);

        List<Phone> phoneListValidated = phoneService.validatePhoneNumbers();

        Assert.assertNotNull(phoneListValidated);
        Assert.assertTrue(phoneListValidated.size() > 0 );
    }
}
