package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.util.*;

import javax.xml.crypto.Data;


@Entity
public class Teacher {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private long id;
	  private String teacherName;
	  private String teacherAdress;
	  private Qualification qualification;
	  private int age;
	  private long experience;
	  private LocalDate dob;
	  public long getId() {
		  return id;
	  }
	  public void setId(long id) {
		  this.id = id;
	  }
	  public String getTeacherName() {
		  return teacherName;
	  }
	  public void setTeacherName(String teacherName) {
		  this.teacherName = teacherName;
	  }
	  public String getTeacherAdress() {
		  return teacherAdress;
	  }
	  public void setTeacherAdress(String teacherAdress) {
		  this.teacherAdress = teacherAdress;
	  }
	  public Qualification getQualification() {
		  return qualification;
	  }
	  public void setQualification(Qualification qualification) {
		  this.qualification = qualification;
	  }
	  public int getAge() {
		  return age;
	  }
	  public void setAge(int age) {
		  this.age = age;
	  }
	  public long getExperience() {
		  return experience;
	  }
	  public void setExperience(long experience) {
		  this.experience = experience;
	  }
	  public LocalDate getDob() {
		  return dob;
	  }
	  public void setDob(LocalDate dob) {
		  this.dob = dob;
	  }
	  public Teacher(long id, String teacherName, String teacherAdress, Qualification qualification, int age,
			long experience, LocalDate dob) {
		super();
		this.id = id;
		this.teacherName = teacherName;
		this.teacherAdress = teacherAdress;
		this.qualification = qualification;
		this.age = age;
		this.experience = experience;
		this.dob = dob;
	  }
	  public Teacher() {
		super();
	  }
	  
	  

}
