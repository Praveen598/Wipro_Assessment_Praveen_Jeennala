package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Question;
import com.example.demo.service.questionService;




@RestController
public class QuestionCon {
	@Autowired
	public questionService qservice;
	
	@PostMapping("/addNewquestion")
	private Question addUser(@RequestBody Question question) {
		
		return qservice.saveData(question);
	}
	@GetMapping("/getAllQuestions")
	public Page<Question> getAllQuestions(Pageable page){
		return qservice.getAllQuestion(page);
		
	}
	
	
	@GetMapping("/getById/{id}")
	public Question getById(@PathVariable Long id) {
		return qservice.getById(id);
	}
	@PutMapping("/updateQuestion/{id}")
	public Question updateQuestion(@PathVariable Long id,@RequestBody Question question) {
		return qservice.UpdateQuestion(id,question);
	}
	@DeleteMapping("/deleteQuestion/{id}")
	public void DeleteQuestion(@PathVariable Long id) {
		qservice.deleteById(id);
	}
	
	

}
