package com.example.demo.repo;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.eenum.Caategory;
import com.example.demo.entity.Question;


public interface questionRepo extends JpaRepository<Question, Long> {
	@Query(value = "SELECT * FROM question q WHERE q.category = :category AND q.level = :difficulty ORDER BY RAND() LIMIT 3", nativeQuery = true)

	List<Question> findRandomQuestionsByCategoryAndLevel(String category, String difficulty);

	List<Question> findByCategory(Caategory category);

}

