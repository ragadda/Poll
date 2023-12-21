package com.example.Poll.service;

import com.example.Poll.model.Poll;
import com.example.Poll.model.QuestionResponse;
import com.example.Poll.repository.PollRepositoryImpl;
import com.example.Poll.repository.mapper.PollMapper;
import com.example.Poll.utils.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PollServiceImpl implements PollService {
    @Autowired
    private PollRepositoryImpl pollRepository;

    @Override
    public void createPoll(Poll poll) {

    }

    @Override
    public void updatePoll(Poll poll) {

    }

    @Override
    public void deletePoll(Integer id) {

    }

    @Override
    public Poll getPollBypPollId(Integer pollId) {
        return  pollRepository.getPollBypPollId(pollId);
    }

    @Override
    public QuestionResponse getNumberOfUsersForEachOption(Integer pollId) {
        return null;
    }

    @Override
    public List<Integer> getNumberOfUsersAnswerPoll(Integer pollId) {
        return null;
    }

    @Override
    public List<Poll> getAllPollsByUserId(Integer userId) {
        return null;
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
