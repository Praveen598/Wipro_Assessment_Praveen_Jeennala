package com.example.demo.repository;

import com.example.demo.entity.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SchoolRepository extends JpaRepository<School, Long> {

    List<School> findBySchoolNameContaining(String keyword);

    
    @Query(value = """
    	    SELECT s.*
    	    FROM school s
    	    JOIN teacher t ON s.teacher_id = t.id
    	    WHERE t.teacher_name = :name
    	""", nativeQuery = true)
    	List<School> findSchoolsByTeacherName(@Param("name") String teacherName);

}
