package com.example.Poll.model.Response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class QuestionsNumberResponse {
    @JsonProperty(value = "user_id")
    private Integer userId;
    @JsonProperty(value = "answered_questions_number")
    private Integer questionsNum;

    public QuestionsNumberResponse(Integer userId, Integer questionsNum) {
        this.userId = userId;
        this.questionsNum = questionsNum;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getQuestionsNum() {
        return questionsNum;
    }

    public void setQuestionsNum(Integer questionsNum) {
        this.questionsNum = questionsNum;
    }
}//end class
