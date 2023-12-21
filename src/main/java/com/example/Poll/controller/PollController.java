package com.example.Poll.controller;

import com.example.Poll.model.Poll;
import com.example.Poll.model.QuestionResponse;
import com.example.Poll.service.PollServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/poll")
public class PollController {

    @Autowired
    private PollServiceImpl pollService;
    @PostMapping(value ="/creat")
    void createPoll(@RequestBody Poll poll){
        pollService.createPoll(poll);
    }

    @PutMapping(value ="/update")
    void updatePoll(@RequestBody Poll poll){
        pollService.createPoll(poll);
    }
    @DeleteMapping(value ="/delete")
    void deletePoll(@RequestParam(value = "poll_id") Integer pollId){
        pollService.deletePoll(pollId);
    }

    @PutMapping(value = "update_question")
    public void updateQuestion(@RequestParam Integer id,@RequestParam String title){
        pollService.updateQuestion(id,title);
    }

    @GetMapping(value = "/user_number_choose_poll")
    QuestionResponse getNumberOfUsersForEachOption(@RequestParam(value = "poll_id") Integer pollId){
        return  pollService.getNumberOfUsersForEachOption(pollId);
    }
    @GetMapping(value ="/user_number_answer_poll")
    Integer getNumberOfUsersAnswerPoll( @RequestParam(value = "poll_id") Integer pollId){
        return  pollService.getNumberOfUsersAnswerPoll(pollId);
    }
    @GetMapping(value ="/all_polls")
    List<Poll> getAllPollsByUserId(@RequestParam(value = "user_id") Integer userId){
        return  pollService.getAllPollsByUserId(userId);
    }
    @GetMapping(value ="/answered_question")
    Integer getNumberOfQuestionThisUserAnsweredTo(@RequestParam(value = "user_id") Integer userId){
        return  pollService.getNumberOfQuestionThisUserAnsweredTo(userId);
    }
    @GetMapping(value ="/all_polls_and_user_number")
    List<QuestionResponse>  getAllPollsAndUsersNumber(){
        return  pollService.getAllPollsAndUsersNumber();
    }



}//end class
