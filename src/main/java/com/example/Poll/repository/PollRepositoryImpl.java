package com.example.Poll.repository;

import com.example.Poll.model.Poll;
import com.example.Poll.model.Response.QuestionResponse;
import com.example.Poll.model.Response.TotalQuestionAnswersResponse;
import com.example.Poll.model.Response.QuestionsNumberResponse;
import com.example.Poll.model.Response.UserQuestionsResponse;
import com.example.Poll.repository.mapper.PollMapper;
import com.example.Poll.repository.mapper.UserQuestionMapper;
import com.example.Poll.service.AnswerServiceImpl;
import com.example.Poll.utils.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
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
        String sql = "UPDATE "+ Constant.POLL_TABLE_NAME +" SET title = ? first_answer=? secondd_answer=? " +
                "third_answer=? fourth_answer=?";
        jdbcTemplate.update(sql,poll.getTitle(),poll.getFirst_answer(),poll.getSecond_answer(),poll.getSecond_answer(),
                poll.getThird_answer(),poll.getFourth_answer());
    }

    @Override
    public void deletePoll(Integer id) {
        String sql = "DELETE FROM "+ Constant.POLL_TABLE_NAME+" WHERE id = ?";
         jdbcTemplate.update(sql,id);
    }

    @Override
    public void updateQuestion(Integer id,String title) {
        String sql = "UPDATE "+ Constant.POLL_TABLE_NAME +" SET title = ? WHERE poll_id = ?";
        jdbcTemplate.update(sql,title,id);
    }

    @Override
    public Integer getNumberOfUserByAnswerNumber(String answer) {
        String sql=" SELECT COUNT(answer) FROM "+ Constant.ANSWER_TABLE_NAME +" WHERE answer=?";
        return jdbcTemplate.queryForObject(sql, Integer.class,answer);
    }

    @Override
    public Integer getQuestionsNumber() {
        String sql="SELECT MAX(id) FROM "+ Constant.POLL_TABLE_NAME;
        return jdbcTemplate.queryForObject(sql, Integer.class);
    }

    @Override
    public Integer ifQuestionIsAnsweredByUser(Integer pollId) {
        String sql = "SELECT COUNT(poll_id) FROM "+ Constant.ANSWER_TABLE_NAME +" WHERE poll_id = ?";
        return jdbcTemplate.queryForObject(sql,Integer.class,pollId);
    }

    @Override
    public QuestionsNumberResponse getQuestionsNumberByUserId(Integer userId) {
        String sql = "SELECT COUNT(user_id) FROM " + Constant.ANSWER_TABLE_NAME + " WHERE user_id=?";
        Integer questionsNum = jdbcTemplate.queryForObject(sql, Integer.class, userId);
        return new QuestionsNumberResponse(userId, questionsNum);
    }


    @Override
    public Poll getPollByPollId(Integer pollId) {
        try {
            String sql = "SELECT * FROM " + Constant.POLL_TABLE_NAME + " WHERE id = ?";
            return jdbcTemplate.queryForObject(sql, new PollMapper(), pollId);
        }catch (EmptyResultDataAccessException e){
            return null;
        }
    }


    @Override
    public List<Poll> getAllPollsByUserId(Integer userId) {
        String sql = "SELECT *" +
                " FROM " + Constant.POLL_TABLE_NAME +
                " INNER JOIN " + Constant.ANSWER_TABLE_NAME +
                " ON " + Constant.POLL_TABLE_NAME+".id =" + Constant.ANSWER_TABLE_NAME +".user_id"+
                " WHERE user_id=?";
        return jdbcTemplate.query(sql,new PollMapper(),userId);
    }

    @Override
    public TotalQuestionAnswersResponse getTotalAnswersByPollId(Integer pollId) {
        String sql="SELECT COUNT(answer) FROM "+ Constant.ANSWER_TABLE_NAME +" WHERE poll_id=?";
        Integer answersNum=jdbcTemplate.queryForObject(sql, Integer.class,pollId);
        return new TotalQuestionAnswersResponse(pollId,answersNum);
    }


    @Override
    public List<UserQuestionsResponse> getUserAnswer(Integer userId) {
        try {
            String sql = "SELECT * FROM " + Constant.ANSWER_TABLE_NAME + " WHERE user_id = ?";
            return jdbcTemplate.query(sql, new UserQuestionMapper(), userId);
        }catch (EmptyResultDataAccessException e){
            return  null;
        }
    }


}//endclass
