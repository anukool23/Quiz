package com.quizapp.quizApp.dao;

import com.quizapp.quizApp.model.Question;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Repository
public interface QuestionDao extends JpaRepository<Question, Integer>{

   List<Question> findByCategory(String category);

//   @Query(value = "SELECT * FROM question q WHERE q.CATEGOTY=:category ORDER BY RANDOM() LIMIT :numQ", nativeQuery = true)
//   List<Question> findRandomQuestionByCategory(String category, int numQ);

   @Query(value = "SELECT * FROM question q WHERE q.CATEGORY = :category ORDER BY RANDOM() LIMIT :numQ", nativeQuery = true)
   List<Question> findRandomQuestionByCategory(@Param("category") String category, @Param("numQ") int numQ);


}
