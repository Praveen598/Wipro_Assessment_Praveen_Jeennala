package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import com.example.demo.eenum.Caategory;
import com.example.demo.eenum.difficultyLevel;


@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull(message="question not be null")
    private String questionText;

    private String opt1;
    private String opt2;
    private String opt3;
    private String opt4;

   
    private String correctAnswer; 
    @Enumerated(EnumType.STRING)
    private difficultyLevel level;

    @Enumerated(EnumType.STRING)
    private Caategory category;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getQuestionText() {
		return questionText;
	}
	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}
	public String getOpt1() {
		return opt1;
	}
	public void setOpt1(String opt1) {
		this.opt1 = opt1;
	}
	public String getOpt2() {
		return opt2;
	}
	public void setOpt2(String opt2) {
		this.opt2 = opt2;
	}
	public String getOpt3() {
		return opt3;
	}
	public void setOpt3(String opt3) {
		this.opt3 = opt3;
	}
	public String getOpt4() {
		return opt4;
	}
	public void setOpt4(String opt4) {
		this.opt4 = opt4;
	}
	public String getCorrectAnswer() {
		return correctAnswer;
	}
	public void setCorrectAnswer(String correctAnswer) {
		this.correctAnswer = correctAnswer;
	}
	public difficultyLevel getLevel() {
		return level;
	}
	public void setLevel(difficultyLevel level) {
		this.level = level;
	}
	public Caategory getCategory() {
		return category;
	}
	public void setCategory(Caategory category) {
		this.category = category;
	}
	public Question(Long id, String questionText, String opt1, String opt2, String opt3, String opt4,
			String correctAnswer, difficultyLevel level, Caategory category) {
		super();
		this.id = id;
		this.questionText = questionText;
		this.opt1 = opt1;
		this.opt2 = opt2;
		this.opt3 = opt3;
		this.opt4 = opt4;
		this.correctAnswer = correctAnswer;
		this.level = level;
		this.category = category;
	}
	public Question() {
		super();
	}
    
    
    
}

