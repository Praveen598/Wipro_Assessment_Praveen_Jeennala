package com.example.demo.repository;

import com.example.demo.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {

  
    List<Teacher> findByExperienceGreaterThanEqual(int experience);

   
    @Query(value = "SELECT * FROM teacher WHERE qualification = ?1", nativeQuery = true)
    List<Teacher> findByQualificationNative(String qualification);


	
}
