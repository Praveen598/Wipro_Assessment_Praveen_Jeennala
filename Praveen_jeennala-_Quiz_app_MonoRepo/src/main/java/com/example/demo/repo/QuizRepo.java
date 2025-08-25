package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Quiz;

public interface QuizRepo extends JpaRepository<Quiz, Integer> {

}
