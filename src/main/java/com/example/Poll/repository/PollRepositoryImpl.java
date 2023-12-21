package com.example.Poll.repository;

import com.example.Poll.model.Poll;
import com.example.Poll.model.QuestionResponse;
import com.example.Poll.repository.mapper.PollMapper;
import com.example.Poll.utils.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PollRepositoryImpl implements PollRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public void createPoll(Poll poll) {
        String sql = "INSERT INTO " + Constant.POLL_TABLE_NAME + " (title,first_answer,secondd_answer,third_answer,fourth_answer) VALUES ( ?,?,?,?,?)";
        jdbcTemplate.update(sql,
                poll.getPollId(),
                poll.getFirst_answer(),
                poll.getSecond_answer(),
                poll.getThird_answer(),
                poll.getFourth_answer());
    }


    @Override
    public void updatePoll(Poll poll) {

    }

    @Override
    public void deletePoll(Integer id) {
        System.out.println("Customer with id = " + id + " was deleted");
        String sql = "DELETE FROM "+ Constant.POLL_TABLE_NAME+" WHERE id = ?";
        jdbcTemplate.update(sql,id);
    }

    @Override
    public Poll getPollBypPollId(Integer pollId) {
        String sql = "SELECT * FROM "+ Constant.POLL_TABLE_NAME +" WHERE id = ?";
        return jdbcTemplate.queryForObject(sql,new PollMapper(),pollId);
    }

    @Override
    public List<Integer> getNumberOfUsersForEachOption(Integer pollId) {
        return null;
    }

    @Override
    public List<Integer> getNumberOfUsersAnswerPoll(Integer pollId) {
        return null;
    }


    @Override
    public Poll getPollByUserId(Integer userId) {
        return null;
    }

    @Override
    public List<Poll> getAllPollsByUserId(Integer userId) {
        String sql = "SELECT *" +
                " FROM" + Constant.POLL_TABLE_NAME +
                "RIGHT JOIN" + Constant.ANSWER_TABLE_NAME +
                " ON " + Constant.POLL_TABLE_NAME+".id =" + Constant.ANSWER_TABLE_NAME +".poll_id"+
                "WHERE user_id=?";
        return jdbcTemplate.query(sql,new PollMapper(),userId);
    }

    @Override
    public List<String> getAllTheAnswersByUserId(Integer userId) {
        return null;
    }

    @Override
    public List<QuestionResponse> getAllPollsAndUsersNumber() {
        return null;
    }

}//endclass
