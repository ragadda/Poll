package com.example.Poll.repository.mapper;

import com.example.Poll.model.Poll;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PollMapper implements RowMapper<Poll> {

    @Override
    public Poll mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Poll(
                rs.getInt("id"),
                rs.getString("title"),
                rs.getString("first_answer"),
                rs.getString("second_answer"),
                rs.getString("third_answer"),
                rs.getString("fourth_answer")
        );
    }
}
