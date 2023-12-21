package com.example.Poll.model;

public class QuestionResponse {
    private Integer questionId;
    private Integer a;
    private Integer b;
    private Integer c;
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
