package com.example.Poll.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class QuestionResponse {
    @JsonProperty(value = "question_id")
    private Integer questionId;
    @JsonProperty(value = "option a")
    private Integer a;
    @JsonProperty(value = "option b")
    private Integer b;
    @JsonProperty(value = "option c")
    private Integer c;
    @JsonProperty(value = "option d")
    private Integer d;


    public QuestionResponse(Integer questionId, Integer a, Integer b, Integer c, Integer d) {
        this.questionId = questionId;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public Integer getB() {
        return b;
    }

    public void setB(Integer b) {
        this.b = b;
    }

    public Integer getC() {
        return c;
    }

    public void setC(Integer c) {
        this.c = c;
    }

    public Integer getD() {
        return d;
    }

    public void setD(Integer d) {
        this.d = d;
    }
}//end class
