package com.jumia.country.model;

import com.jumia.country.config.DataSourceConfig;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.autoconfigure.jdbc.JdbcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.test.context.jdbc.Sql;

import javax.sql.DataSource;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
@JdbcTest
@Sql({"sample.db"})
public class CustomerDAOTest {

    @InjectMocks
    private CustomerDAO customerDAO;

    @MockBean
    DataSourceConfig dataSourceConfig;

    @InjectMocks
    private JdbcTemplate jdbcTemplate;

    @Before
    public void init(){
        jdbcTemplate.setDataSource((DataSource) dataSourceConfig);
        customerDAO.setJdbcTemplate(this.jdbcTemplate);
    }

    @Test
    public void fetchPhoneNumbersTest(){
        SqlRowSet resultSet = Mockito.mock(SqlRowSet.class);
        resultSet.set
        Mockito.when(jdbcTemplate.queryForRowSet(Mockito.anyString())).thenReturn(resultSet);
        List<String> phoneList = customerDAO.fetchPhoneNumbers();

        Assert.assertNotNull(phoneList);
        Assert.assertTrue(phoneList.size() > 0 );
    }
}
