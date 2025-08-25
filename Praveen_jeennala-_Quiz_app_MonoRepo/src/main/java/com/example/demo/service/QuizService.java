package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Question;
import com.example.demo.entity.QuestionWrapper;
import com.example.demo.entity.Quiz;
import com.example.demo.entity.Response;
import com.example.demo.repo.QuizRepo;
import com.example.demo.repo.questionRepo;
@Service
public class QuizService {
	@Autowired
	public questionRepo repo;
	@Autowired
	public QuizRepo repo1;
	
	public Quiz createQuiz(String category, String level,  String title) {
	    List<Question> questions = repo.findRandomQuestionsByCategoryAndLevel(category, level);

	    Quiz quiz = new Quiz();
	    quiz.setQuizTitle(title);
	    quiz.setQuestions(questions);

	    return repo1.save(quiz);
	}
	
	  public List<QuestionWrapper> getQuizQuestions(Integer id) {
	    	
	    	//getting all questions for quiz
	        Optional<Quiz> quiz = repo1.findById(id);
	        
	        
	       List<Question> questionsFromDB = quiz.get().getQuestions();
	       
	        List<QuestionWrapper> questionsForUser = new ArrayList<>();
	        for(Question q : questionsFromDB){
	            QuestionWrapper qw = new QuestionWrapper(q.getId(), q.getQuestionText(), q.getOpt1(), q.getOpt2(), q.getOpt3(), q.getOpt4());
	            questionsForUser.add(qw);
	        }

	        return questionsForUser;

	    }



		
	    public Integer calculateResult(int id, List<Response> responses) {
	        Quiz quiz = repo1.findById(id).get();
	        List<Question> questions = quiz.getQuestions();
	        int Score = 0;

	        for (Response response : responses) {
	            for (Question question : questions) {
	                if (question.getId() == response.getId()) {
	                    if (question.getCorrectAnswer().equalsIgnoreCase(response.getUserAnswer())) {
	                    	Score++;
	                    }
	                    break; // no need to keep checking once matched
	                }
	            }
	        }

	        return Score;
	    }

}
