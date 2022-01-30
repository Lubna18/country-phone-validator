package com.jumia.country.service;

import com.jumia.country.model.Country;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class CountryService {

    protected List<Country> loadCountriesData(){
        List<Country> countries = new ArrayList<>();

        Country country = new Country("Cameroon","+237","\\(237\\)\\ ?[2368]\\d{7,8}$");
        Country country1 = new Country("Ethiopia","+251","\\(251\\)\\ ?[1-59]\\d{8}$");
        Country country2 = new Country("Morocco","+212","\\(212\\)\\ ?[5-9]\\d{8}$");
        Country country3 = new Country("Mozambique","+258","\\(258\\)\\ ?[28]\\d{7,8}$");
        Country country4 = new Country("Uganda","+256","\\(256\\)\\ ?\\d{9}$");
        countries.add(country);
        countries.add(country1);
        countries.add(country2);
        countries.add(country3);
        countries.add(country4);

        return countries;
    }

}
