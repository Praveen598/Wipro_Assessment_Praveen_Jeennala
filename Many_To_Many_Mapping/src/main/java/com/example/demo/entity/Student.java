package com.example.demo.entity;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	@ManyToMany
	@JoinTable(name="student_subject",
	joinColumns = @JoinColumn(name="student_id"),
	inverseJoinColumns = @JoinColumn(name="subject_id"))
	private List<Subject> subjects;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Subject> getSubject() {
		return subjects;
	}
	public void setSubject(List<Subject> subject) {
		this.subjects = subject;
	}
	public Student(Long id, String name, List<Subject> subject) {
		super();
		this.id = id;
		this.name = name;
		this.subjects = subject;
	}
	public Student() {
		super();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
