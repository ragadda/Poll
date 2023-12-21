package com.example.Poll.service;

import com.example.Poll.model.AnswerNumber;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@Service
public interface AnswerService {

    public void chooseAnswer(AnswerNumber answerNumber, Integer userId, Integer pollId);
    public  void updateAnswer(AnswerNumber answerNumber,Integer userId,Integer pollId);

    public void deleteAllUserAnswers(Integer userId);

    public void deleteUserAnswerbyPollId(Integer userId, Integer pollId);


}//endclass
