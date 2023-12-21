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
        String sql = "INSERT INTO " + Constant.ANSWER_TABLE_NAME + " (user_id,poll_id,answer) VALUES ( ?,?,?)";
        jdbcTemplate.update(sql, pollId,userId,answer);
    }

    @Override
    public void updateAnswer(AnswerNumber answerNumber, Integer userId, Integer pollId) {

    }

    @Override
    public void deleteAllUserAnswers(Integer userId) {

    }

    @Override
    public void deleteUserAnswerbyPollId(Integer userId, Integer pollId) {

    }
}//endclass
