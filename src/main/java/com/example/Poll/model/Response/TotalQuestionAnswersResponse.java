package com.example.Poll.model.Response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TotalQuestionAnswersResponse {

    @JsonProperty(value = "question_id")
    private Integer questionId;
    @JsonProperty(value = "answeres_number")
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
