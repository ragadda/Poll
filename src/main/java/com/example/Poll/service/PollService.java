package com.example.Poll.service;

import com.example.Poll.model.Poll;
import com.example.Poll.model.QuestionResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PollService {
    public void createPoll(Poll poll);
    public void updatePoll(Poll poll);
    public void deletePoll(Integer id);


    public Poll getPollBypPollId(Integer pollId);
    public QuestionResponse getNumberOfUsersForEachOption(Integer pollId);
    public List<Integer> getNumberOfUsersAnswerPoll(Integer pollId);
    public List<Poll> getAllPollsByUserId(Integer userId);
    public List<String> getAllTheAnswersByUserId(Integer userId);
    public List<QuestionResponse> getAllPollsAndUsersNumber();



}//ensclass
