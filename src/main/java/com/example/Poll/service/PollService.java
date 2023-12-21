package com.example.Poll.service;

import com.example.Poll.model.Poll;
import com.example.Poll.model.PollResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PollService {
    public void createPoll(Poll poll);
    public void updatePoll(Poll poll);
    public void deletePoll(Integer id);


    public Poll getPollBypPollId(Integer pollId);
    public List<Integer> howMonyUsersChooseThisPoll(Integer pollId);
    public List<Integer> howMonyUsersAnswerToThisPoll(Integer pollId);
    public List<Poll> getAllPollsByUserId(Integer userId);
    public List<String> getAllTheAnswersByUserId(Integer userId);
    public List<PollResponse> getAllPollsAndUsersNumber();



}//ensclass
