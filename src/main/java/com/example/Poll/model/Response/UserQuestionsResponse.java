package com.example.Poll.model.Response;

public class UserQuestionsResponse {
    private Integer userId;
    private Integer questionsNum;

    public UserQuestionsResponse(Integer userId, Integer questionsNum) {
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
