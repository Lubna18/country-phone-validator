package com.jumia.country.model;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CustomerDAOTest {

    @InjectMocks
    private CustomerDAO customerDAO;

    @Mock
    private JdbcTemplate jdbcTemplate;

    @Test
    public void fetchPhoneNumbersTest(){

        SqlRowSet resultSet = Mockito.mock(SqlRowSet.class);
        Mockito.when(jdbcTemplate.queryForRowSet(Mockito.anyString())).thenReturn(resultSet);
        List<String> phoneList = customerDAO.fetchPhoneNumbers();

        Assert.assertNotNull(phoneList);
    }
}
