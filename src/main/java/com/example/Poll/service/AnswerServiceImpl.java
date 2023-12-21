package com.example.Poll.service;

import com.example.Poll.model.AnswerNumber;
import com.example.Poll.model.Poll;
import com.example.Poll.repository.AnswerRepositoryImpl;
import com.example.Poll.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnswerServiceImpl implements AnswerService {


    @Autowired
    private PollServiceImpl pollService;

    @Autowired
    private AnswerRepositoryImpl answerRepository;


    @Override
    public void chooseAnswer(AnswerNumber answerNumber, Integer userId, Integer pollId) {
        if (userId != null){//&& userService.getUserByUserId(userId) != null) {
            Poll poll =pollService.getPollBypPollId(pollId);
            String answer=pollService.getAnswerByAnswerNumber(answerNumber,poll);
            answerRepository.chooseAnswer(answer,pollId,userId);
        } else {
            System.out.println("you must register to answer the questions");
        }//end else
    }//end chooseAnswer


    @Override
    public void updateAnswer(AnswerNumber answerNumber, Integer userId, Integer pollId) {
        Poll poll =pollService.getPollBypPollId(pollId);
        String answer=pollService.getAnswerByAnswerNumber(answerNumber,poll);
        answerRepository.updateAnswer(answer,pollId,userId);
    }//end updateAnswer

    @Override
    public void deleteAllUserAnswers(Integer userId) {
        //צריך לבדוק אם היוזר קיים
        answerRepository.deleteAllUserAnswers(userId);
    }

    @Override
    public void deleteUserAnswerbyPollId(Integer userId, Integer pollId) {
        answerRepository.deleteUserAnswerbyPollId(userId,pollId);
    }
}//endclass
