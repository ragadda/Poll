package com.example.Poll.model.Response;

public class TotalQuestionAnswersResponse {

    private Integer questionId;
    private Integer answersNum;//how many users answer to question in total

    public TotalQuestionAnswersResponse(Integer questionId, Integer answersNum) {
        this.questionId = questionId;
        this.answersNum = answersNum;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public Integer getAnswersNum() {
        return answersNum;
    }

    public void setAnswersNum(Integer answersNum) {
        this.answersNum = answersNum;
    }
}//end class
