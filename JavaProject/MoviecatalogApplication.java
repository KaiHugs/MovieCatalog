package com.spring.moviecatalog;

import com.spring.moviecatalog.dao.MovieDao;
import com.spring.moviecatalog.dao.MovieDaoImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


import javax.sql.DataSource;

@SpringBootApplication
public class MoviecatalogApplication {
    

    public static void main (String[] args){
        SpringApplication.run(MoviecatalogApplication.class, args);
    }

    @Bean
    MovieDao movieDao(){
        return new MovieDaoImpl();
    }


    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource){
        return new JdbcTemplate(dataSource);
    }

    @Bean
    public DataSource getDataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql._____-");
        dataSource.setUrl("__:mysql://localhost___/moviecatalog");
        dataSource.setUsername("Root");
        dataSource.setPassword("");
        return dataSource;
    }
}
