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
    void deletePoll(@RequestParam Integer pollId){
        pollService.deletePoll(pollId);
    }


    @GetMapping(value = "/user_number_choose_poll")
    QuestionResponse getNumberOfUsersForEachOption(@RequestParam Integer pollId){
        return  pollService.getNumberOfUsersForEachOption(pollId);
    }
    @GetMapping(value ="/user_number_answer_poll")
    List<Integer> getNumberOfUsersAnswerPoll( @RequestParam Integer pollId){
        return  pollService.getNumberOfUsersAnswerPoll(pollId);
    }
    @GetMapping(value ="/all_polls")
    List<Poll> getAllPollsByUserId(@RequestParam Integer userId){
        return  getAllPollsByUserId(userId);
    }
    @GetMapping(value ="/all_aswer")
    List<String> getAllTheAnswersByUserId(@RequestParam Integer userId){
        return  getAllTheAnswersByUserId(userId);
    }
    @GetMapping(value ="/all_polls_and_user_number")
    List<QuestionResponse> getAllPollsAndUsersNumber(){
        return  getAllPollsAndUsersNumber();
    }



}//end class
