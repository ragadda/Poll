package com.example.Poll.repository.mapper;

import com.example.Poll.model.Response.UserQuestionsResponse;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserQuestionMapper implements RowMapper<UserQuestionsResponse> {

    @Override
    public UserQuestionsResponse mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new  UserQuestionsResponse(
                rs.getInt("poll_id"),
                rs.getInt("user_id"),
                rs.getString("answer")
        );
    }
}//end class
