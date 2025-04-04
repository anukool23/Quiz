package com.quizapp.quizApp.service;

import com.quizapp.quizApp.model.Question;
import com.quizapp.quizApp.dao.QuestionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionDao  questionDao;

//    @Transactional
    public List<Question> getAllQuestions(){
        List<Question> questions = questionDao.findAll();
//        System.out.println("Questions: " + questions);
        return questions;
//       return  questionDao.findAll();
    }


    public ResponseEntity<List<Question>> getQuestionByCategory(String category) {
        try {
            return new ResponseEntity<>(questionDao.findByCategory(category), HttpStatus.OK);
        }
        catch(Exception e){
            e.printStackTrace();
            return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
            }


    }

    public String addQuestion(Question question) {
        questionDao.save(question);
        return "Added Successfully";
    }

    public String deleteQuestion(Integer id) {
        questionDao.deleteById(id);
        return ("Deleted successfully");
    }

    public String updateQuestion( Question question) {
        questionDao.save(question);
        return "Updated Successfully";
    }

}
