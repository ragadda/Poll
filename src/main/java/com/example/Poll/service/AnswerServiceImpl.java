package com.example.Poll.service;

import com.example.Poll.model.AnswerNumber;
import com.example.Poll.model.Poll;
import com.example.Poll.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnswerServiceImpl implements AnswerService {


    @Autowired
    private PollServiceImpl pollService;

    @Autowired
    private UserService userService;
    @Override
    public void chooseAnswer(AnswerNumber answerNumber, Integer userId, Integer pollId) {
        if (userId != null && userService.getUserByUserId(userId) != null) {
            String answer = "";
            Poll poll =pollService.getPollBypPollId(pollId);
            if (answerNumber.toString() == "A") {
                answer = poll.getFirst_answer();
            }
            if (answerNumber.toString() == "B") {
                answer = poll.getSecond_answer();
            }
            if (answerNumber.toString() == "C") {
                answer = poll.getThird_answer();
            }
            if (answerNumber.toString() == "D") {
                answer = poll.getFourth_answer();
            }
            //answerRepository.chooseAnswer(pollRequest);
        } else {
            System.out.println("you must register to answer the questions");
        }//end else
    }//end chooseAnswer

    @Override
    public void updateAnswer(AnswerNumber answerNumber, Integer userId, Integer pollId) {

    }

    @Override
    public void deleteAllUserAnswers(Integer userId) {

    }

    @Override
    public void deleteUserAnswerbyPollId(Integer userId, Integer pollId) {

    }
}//endclass
