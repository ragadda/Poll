package com.example.Poll.controller;

import com.example.Poll.model.Poll;
import com.example.Poll.model.PollResponse;
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
    void createPoll(Poll poll){
        pollService.createPoll(poll);
    }

    @PutMapping(value ="/update")
    void updatePoll(Poll poll){
        pollService.createPoll(poll);
    }
    @DeleteMapping(value ="/delete")
    void deletePoll(Integer pollId){
        pollService.deletePoll(pollId);
    }


    @GetMapping(value = "/user_number_choose_poll")
    List<Integer> howMonyUsersChooseThisPoll(Integer pollId){
        return  pollService.howMonyUsersChooseThisPoll(pollId);
    }
    @GetMapping(value ="/user_number_answer_poll")
    List<Integer> howMonyUsersAnswerToThisPoll(Integer pollId){
        return  pollService.howMonyUsersAnswerToThisPoll(pollId);
    }
    @GetMapping(value ="/all_polls")
    List<Poll> getAllPollsByUserId(Integer userId){
        return  getAllPollsByUserId(userId);
    }
    @GetMapping(value ="/all_aswer")
    List<String> getAllTheAnswersByUserId(Integer userId){
        return  getAllTheAnswersByUserId(userId);
    }
    @GetMapping(value ="/all_polls_and_user_number")
    List<PollResponse> getAllPollsAndUsersNumber(){
        return  getAllPollsAndUsersNumber();
    }



}//end class
