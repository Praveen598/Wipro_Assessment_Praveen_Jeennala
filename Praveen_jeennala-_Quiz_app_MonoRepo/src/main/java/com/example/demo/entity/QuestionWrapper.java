package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuestionWrapper {
	private Long id;
	private String QuestionTitle;
	private String Opt1;
	private String opt2;
	private String op3;
	private String op4;

}
