package com.example.Poll.service;

import com.example.Poll.model.AnswerNumber;
import com.example.Poll.model.Poll;
import com.example.Poll.model.QuestionResponse;
import com.example.Poll.repository.PollRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PollServiceImpl implements PollService {
    @Autowired
    private PollRepositoryImpl pollRepository;


    @Override
    public void createPoll(Poll poll) {
        pollRepository.createPoll(poll);
    }

    @Override
    public void updatePoll(Poll poll) {
        pollRepository.updatePoll(poll);
    }

    @Override
    public void deletePoll(Integer id) {
        pollRepository.deletePoll(id);
    }

    @Override
    public void updateQuestion(Integer id,String title) {
        pollRepository.updateQuestion(id,title);
    }

    @Override
    public String getAnswerByAnswerNumber(AnswerNumber answerNumber ,Poll poll) {
        String answer="";
        if (answerNumber == AnswerNumber.A) {
            answer = poll.getFirst_answer();
        }
        if (answerNumber== AnswerNumber.B) {
            answer = poll.getSecond_answer();
        }
        if (answerNumber== AnswerNumber.C) {
            answer = poll.getThird_answer();
        }
        if (answerNumber== AnswerNumber.D) {
            answer = poll.getFourth_answer();
        }
        return answer;
    }

    @Override
    public Poll getPollByPollId(Integer pollId) {
        return  pollRepository.getPollByPollId(pollId);
    }

    @Override
    public QuestionResponse getNumberOfUsersForEachOption(Integer pollId) {
        Integer questionId=pollId;
        Poll poll= getPollByPollId(pollId);
        String answerA=getAnswerByAnswerNumber(AnswerNumber.A,poll);
        Integer a=pollRepository.getNumberOfUserByAnswerNumber(answerA);

        String answerB=getAnswerByAnswerNumber(AnswerNumber.B,poll);
        Integer b=pollRepository.getNumberOfUserByAnswerNumber(answerB);

        String answerC=getAnswerByAnswerNumber(AnswerNumber.C,poll);
        Integer c=pollRepository.getNumberOfUserByAnswerNumber(answerC);

        String answerD=getAnswerByAnswerNumber(AnswerNumber.D,poll);
        Integer d=pollRepository.getNumberOfUserByAnswerNumber(answerD);

         return new QuestionResponse(questionId,a,b,c,d);
    }

    @Override
    public Integer getNumberOfUsersAnswerPoll(Integer pollId) {
        return pollRepository.getNumberOfUsersAnswerPoll(pollId);
    }

    @Override
    public List<Poll> getAllPollsByUserId(Integer userId) {
        return pollRepository.getAllPollsByUserId(userId);
    }

    @Override
    public Integer getNumberOfQuestionThisUserAnsweredTo(Integer userId) {
        return pollRepository.getNumberOfQuestionThisUserAnsweredTo(userId);
    }

    @Override
    public List<QuestionResponse>  getAllPollsAndUsersNumber() {
        Integer questionsNumber=pollRepository.getQuestionsNumber();
        List<QuestionResponse> questionResponseList=new ArrayList<>();
        //System.out.println(questionsNumber);
        for (Integer i=1;i<=questionsNumber;i++){
            if(pollRepository.getPollByPollId(i)!=null){
                if (pollRepository.ifQuestionIsAnsweredByUser(i)!=null){
                    questionResponseList.add(getNumberOfUsersForEachOption(i));
                }
            }
        }//endfor
        return questionResponseList;
    }
}//endclass
