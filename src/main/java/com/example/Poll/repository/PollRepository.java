package com.example.Poll.repository;

import com.example.Poll.model.Poll;
import com.example.Poll.model.QuestionResponse;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PollRepository {
    public void createPoll(Poll poll);
    public void updatePoll(Poll poll);
    public void deletePoll(Integer id);


    public Poll getPollBypPollId(Integer pollId);
    public List<Integer> getNumberOfUsersForEachOption(Integer pollId);
    public List<Integer> getNumberOfUsersAnswerPoll(Integer pollId);

    Poll getPollByUserId(Integer userId);

    public List<Poll> getAllPollsByUserId(Integer userId);
    public List<String> getAllTheAnswersByUserId(Integer userId);
    public List<QuestionResponse> getAllPollsAndUsersNumber();

}//end class
