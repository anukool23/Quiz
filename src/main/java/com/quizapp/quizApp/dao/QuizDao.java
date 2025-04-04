package com.quizapp.quizApp.dao;

import com.quizapp.quizApp.model.Question;
import com.quizapp.quizApp.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao extends JpaRepository<Quiz, Integer> {
}
