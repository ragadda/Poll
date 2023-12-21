package com.example.Poll.repository;

import com.example.Poll.model.AnswerNumber;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswerRepository {
    public void chooseAnswer(String answer, Integer userId, Integer pollId);
    public  void updateAnswer(String answer,Integer userId,Integer pollId);

    public void deleteAllUserAnswers(Integer userId);

    public void deleteUserAnswerbyPollId(Integer userId, Integer pollId);


}//endclass
