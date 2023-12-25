package com.example.Poll.service;

import com.example.Poll.model.AnswerNumber;
import com.example.Poll.model.Poll;
import com.example.Poll.model.Response.QuestionResponse;
import com.example.Poll.model.Response.TotalQuestionAnswersResponse;
import com.example.Poll.model.Response.UserQuestionsResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PollService {
    public void createPoll(Poll poll);
    public void updatePoll(Poll poll);
    public void deletePoll(Integer id);
    public void updateQuestion(Integer id,String title);

    public String getAnswerByAnswerNumber(AnswerNumber answerNumber,Poll poll);
    public Poll getPollByPollId(Integer pollId);
    public List<Poll> getAllPollsByUserId(Integer userId);

    public QuestionResponse getNumberOfUsersForEachOption(Integer pollId);//Return how many users choose each ofthe question options
    public TotalQuestionAnswersResponse getTotalAnswersByPollId(Integer pollId);//Return how many users answer to this question in total
    public UserQuestionsResponse getQuestionsNumberByUserId(Integer userId);//Return how many questions this user answered to
    public List<QuestionResponse>  getAllPollsAndUsersNumber();//Return all questions and for each question how many users chooseeach of the question options.


}//ensclass
