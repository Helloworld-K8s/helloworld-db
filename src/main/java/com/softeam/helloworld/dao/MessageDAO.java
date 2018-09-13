package com.softeam.helloworld.dao;

import com.softeam.helloworld.dto.MessageDTO;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;

@Component
public class MessageDAO {


    private final JdbcTemplate jdbcTemplate;

    public MessageDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Collection<MessageDTO> findAll() {
        return jdbcTemplate.query("select * from T_MSG",
                new BeanPropertyRowMapper<>(MessageDTO.class));

    }
}
