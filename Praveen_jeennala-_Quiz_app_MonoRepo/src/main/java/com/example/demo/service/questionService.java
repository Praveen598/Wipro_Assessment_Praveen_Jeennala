package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Question;
import com.example.demo.repo.questionRepo;
import com.example.demo.exception.questionNotfound;
@Service
public class questionService {
	@Autowired
	 public questionRepo repo;
	 
	 
	public  Question saveData(Question question) {
		// TODO Auto-generated method stub
		return repo.save(question);
		
	}
	public Page<Question> getAllQuestion(Pageable page) {
		// TODO Auto-generated method stub
		return repo.findAll(page);
	}
	public Question getById(Long id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElseThrow(()->new questionNotfound("question with this id not found"+id));
	}
	public Question UpdateQuestion(Long id, Question question) {
		Question exist=repo.findById(id).orElseThrow(()->new questionNotfound("id with this question not found"));
		
			exist.setQuestionText(question.getQuestionText());
			exist.setOpt1(question.getOpt1());
			exist.setOpt2(question.getOpt2());
			exist.setOpt3(question.getOpt3());
			exist.setOpt4(question.getOpt4());
			exist.setCorrectAnswer(question.getCorrectAnswer());
			return repo.save(exist);
			
		
	}
	public void deleteById(Long id) {
		repo.deleteById(id);
		
	}
	
	
	
	
	

}
