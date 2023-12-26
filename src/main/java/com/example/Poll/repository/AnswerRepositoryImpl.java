package com.example.Poll.repository;

import com.example.Poll.model.AnswerNumber;
import com.example.Poll.utils.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AnswerRepositoryImpl implements  AnswerRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void chooseAnswer(String answer, Integer userId, Integer pollId) {
        String sql = "INSERT INTO " + Constant.ANSWER_TABLE_NAME + "(user_id,poll_id,answer) VALUES (?,?,?)";
        jdbcTemplate.update(sql, pollId,userId,answer);
    }

    @Override
    public void updateAnswer(String answer, Integer userId, Integer pollId) {
        String sql = "UPDATE "+ Constant.ANSWER_TABLE_NAME +" SET answer = ? WHERE poll_id = ? AND user_id=?";
        jdbcTemplate.update(sql,answer,pollId,userId);
    }

    @Override
    public void deleteAllUserAnswers(Integer userId) {
        String sql = "DELETE FROM "+ Constant.ANSWER_TABLE_NAME +" WHERE user_id = ?";
        jdbcTemplate.update(sql,userId);
    }

    @Override
    public void deleteUserAnswerbyPollId(Integer userId, Integer pollId) {
        String sql = "DELETE FROM "+ Constant.ANSWER_TABLE_NAME +" WHERE user_id = ? AND poll_id=?";
        jdbcTemplate.update(sql,userId,pollId);
    }



}//endclass
