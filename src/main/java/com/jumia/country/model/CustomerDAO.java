package com.jumia.country.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Component
public class CustomerDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<String> fetchPhoneNumbers(){
        List<String> phoneNumbers = new ArrayList<>();
        SqlRowSet resultSet = jdbcTemplate.queryForRowSet("SELECT phone FROM customer");

        while (resultSet.next()) {
            phoneNumbers.add(resultSet.getString("phone"));
        }
        return phoneNumbers;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
