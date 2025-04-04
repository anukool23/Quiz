package com.quizapp.quizApp.controller;
import com.quizapp.quizApp.model.Question;
import com.quizapp.quizApp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @GetMapping("questions")
    public List<Question> getAllQuestions(){
        return questionService.getAllQuestions();
    }

    @GetMapping("category/{category}")
    public ResponseEntity<List<Question>> getQuestinByCategory(@PathVariable("category") String category){
        return questionService.getQuestionByCategory(category);
    }

    @PostMapping("add")
    public String addQuestion(@RequestBody Question question){
        return questionService.addQuestion(question);
    }

    @DeleteMapping("delete/{id}")
    public String deleteQuestion(@PathVariable("id") Integer id){
        return questionService.deleteQuestion(id);
    }

    @PutMapping("update")
    public String updateQuestion( @RequestBody Question question){
        return questionService.updateQuestion( question);
    }
}
