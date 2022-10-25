package com.mp.dao;


import com.mp.model.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class ManagerDao {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public ManagerDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Manager> index(){
      return jdbcTemplate.query("SELECT * FROM Manager ",
              new BeanPropertyRowMapper<>(Manager.class));
    }
}
