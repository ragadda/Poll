package com.example.Poll.repository;

import com.example.Poll.model.Poll;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PollRepository {
    public void createPoll(Poll poll);
    public void updatePoll(Poll poll);
    public void deletePoll(Integer id);

    public  void updateQuestion(Integer id,String title);
    public Integer getNumberOfUserByAnswerNumber(String answer);
    public Integer gerQuestionsNumber();
    public Integer ifQuestionIsAnsweredByUser(Integer pollId);



    public Poll getPollBypPollId(Integer pollId);
    public Integer getNumberOfUsersAnswerPoll(Integer pollId);
    public List<Poll> getAllPollsByUserId(Integer userId);
    public Integer getNumberOfQuestionThisUserAnsweredTo(Integer userId);


}//end class
