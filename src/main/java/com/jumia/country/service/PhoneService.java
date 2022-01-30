package com.jumia.country.service;

import com.jumia.country.model.Country;
import com.jumia.country.model.CustomerDAO;
import com.jumia.country.model.Phone;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PhoneService {

    private CountryService countryService;
    private CustomerDAO customerDAO;

    private final String VALID ="valid";
    private final String NOT_VALID ="not valid";

    public PhoneService(CountryService countryService, CustomerDAO customerDAO) {
        this.countryService = countryService;
        this.customerDAO = customerDAO;
    }

    public List<Phone> validatePhoneNumbers(){
        List<Country> countries = countryService.loadCountriesData();
        List<String> phoneNumbers = customerDAO.fetchPhoneNumbers();

        List<Phone> phones = new ArrayList<>();

        phoneNumbers.forEach(phoneNumber ->{
            String phoneCode = phoneNumber.substring(1,4);

            countries.forEach(country -> {
                if(phoneCode.equals(country.getCountryCode().substring(1))){
                    Phone phone;
                    if(phoneNumber.matches(country.getCodeRegex()))
                    {
                        phone = new Phone(phoneNumber, country.getCountryName(), VALID, country.getCountryCode());
                    }else{
                        phone = new Phone(phoneNumber, country.getCountryName(), NOT_VALID, country.getCountryCode());
                    }
                    phones.add(phone);
                }

            });
        });

        return phones;
    }
}
