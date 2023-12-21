package com.example.Poll.service;

import com.example.Poll.model.Poll;
import com.example.Poll.model.PollResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PollServiceImpl implements PollService {
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
        return null;
    }

    @Override
    public List<Integer> howMonyUsersChooseThisPoll(Integer pollId) {
        return null;
    }

    @Override
    public List<Integer> howMonyUsersAnswerToThisPoll(Integer pollId) {
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
    public List<PollResponse> getAllPollsAndUsersNumber() {
        return null;
    }
}//endclass
