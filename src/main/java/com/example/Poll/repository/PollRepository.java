package com.example.Poll.repository;

import com.example.Poll.model.Poll;
import com.example.Poll.model.Response.TotalQuestionAnswersResponse;
import com.example.Poll.model.Response.QuestionsNumberResponse;
import com.example.Poll.model.Response.UserQuestionsResponse;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PollRepository {
    public void createPoll(Poll poll);
    public void updatePoll(Poll poll);
    public void deletePoll(Integer id);

    public  void updateQuestion(Integer id,String title);
    public Integer getNumberOfUserByAnswerNumber(String answer);
    public Integer getQuestionsNumber();
    public Integer ifQuestionIsAnsweredByUser(Integer pollId);



    public QuestionsNumberResponse getQuestionsNumberByUserId(Integer userId);
    public Poll getPollByPollId(Integer pollId);
    public List<Poll> getAllPollsByUserId(Integer userId);
    public TotalQuestionAnswersResponse getTotalAnswersByPollId(Integer pollId);
    public String getUserAnswer(Integer userId, Integer pollId);

}//end class
