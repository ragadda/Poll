package com.example.Poll.controller;

import com.example.Poll.model.AnswerNumber;
import com.example.Poll.service.AnswerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/answer")
public class AnswerController {
    @Autowired
    private AnswerServiceImpl answerService;
    @PostMapping( value = "/choose")
    public void chooseAnswer(@RequestParam(value = "answer_number") AnswerNumber answerNumber,@RequestParam(value = "user_id")
    Integer userId,@RequestParam(value = "poll_id") Integer pollId){
        answerService.chooseAnswer(answerNumber,userId,pollId);
    }


    @PutMapping(value = "/update_answer")
    public  void updateAnswer(@RequestParam(value = "answer_number") AnswerNumber answerNumber,@RequestParam(value = "user_id")
    Integer userId,@RequestParam(value = "poll_id") Integer pollId){
        answerService.updateAnswer(answerNumber,userId,pollId);
    }

    @DeleteMapping(value ="/delete_all_answers")
    public void deleteAllUserAnswers(@RequestParam(value = "user_id") Integer userId){
        answerService.deleteAllUserAnswers(userId);
    }

    @DeleteMapping(value = "/delete_answer")
    public void deleteUserAnswerbyPollId(@RequestParam(value = "user_id")Integer userId,@RequestParam(value = "poll_id")Integer pollId){
        answerService.deleteUserAnswerbyPollId(userId,pollId);
    }


}//end class
