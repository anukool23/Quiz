package com.quizapp.quizApp.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
//@JsonIgnoreProperties(ignoreUnknown = true)
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String questionTitle;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String rightAnswer;
    private String difficultyLevel;
    private String category;




    public Integer getId() { return id; }
    public String getQuestionTitle() { return questionTitle; }
    public String getOption1() { return option1; }
    public String getOption2() { return option2; }
    public String getOption3() { return option3; }
    public String getOption4() { return option4; }
    public String getRightAnswer() { return rightAnswer; }
    public String getDifficultyLevel() { return difficultyLevel; }
    public String getCategory() { return category; }

    public void setId(Integer id) {
        this.id = id;
    }
    public void setQuestionTitle(String questionTitle) {
        this.questionTitle = questionTitle;
    }
    public void setOption1(String option1) {
        this.option1 = option1;
    }
    public void setOption2(String option2) {
        this.option2 = option2;
    }
    public void setOption3(String option3) {
        this.option3 = option3;
    }
    public void setOption4(String option4) {
        this.option4 = option4;
    }
    public void setRightAnswer(String rightAnswer) {
        this.rightAnswer = rightAnswer;
    }
    public void setDifficultyLevel(String difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }
    public void setCategory(String category) {
        this.category = category;
    }
}
