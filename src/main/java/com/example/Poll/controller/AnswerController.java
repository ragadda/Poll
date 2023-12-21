package com.example.Poll.controller;

import com.example.Poll.model.AnswerNumber;
import com.example.Poll.service.AnswerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/answer_controller")
public class AnswerController {
    @Autowired
    private AnswerServiceImpl answerService;
    @PostMapping( value = "/choose")
    public void chooseAnswer(AnswerNumber answerNumber,Integer userId,Integer pollId){

    }


    @PutMapping(value = "/update_answer")
    public  void updateAnswer(AnswerNumber answerNumber,Integer userId,Integer pollId){

    }

    @DeleteMapping(value = "/delete_all_answers")
    public void deleteAllUserAnswers(Integer userId){

    }

    @DeleteMapping(value = "/delete_answer")
    public void deleteUserAnswerbyPollId(Integer userId,Integer pollId){

    }


}//end class
