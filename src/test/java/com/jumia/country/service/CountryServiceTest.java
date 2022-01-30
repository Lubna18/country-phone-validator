package com.jumia.country.service;

import com.jumia.country.model.Country;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CountryServiceTest {

    @InjectMocks
    CountryService countryService;

    @Test
   public void loadCountriesData(){
        List<Country> countryList = countryService.loadCountriesData();

        Assert.assertNotNull(countryList);
        Assert.assertEquals(countryList.size(),5);
    }
}
