package com.example.Poll.service;

import com.example.Poll.model.AnswerNumber;
import com.example.Poll.model.Poll;
import com.example.Poll.model.QuestionResponse;
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

    public QuestionResponse getNumberOfUsersForEachOption(Integer pollId);
    public Integer getNumberOfUsersAnswerPoll(Integer pollId);
    public List<Poll> getAllPollsByUserId(Integer userId);
    public Integer getNumberOfQuestionThisUserAnsweredTo(Integer userId);
    public List<QuestionResponse>  getAllPollsAndUsersNumber();



}//ensclass
