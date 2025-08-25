package com.example.demo.service;

import com.example.demo.entity.Teacher;
import com.example.demo.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepository teacherRepo;

 
    public Teacher save(Teacher teacher) {
        return teacherRepo.save(teacher);
    }

  
    public Teacher update(Long id, Teacher updated) {
        Teacher existing = teacherRepo.findById(id).orElseThrow();
        existing.setTeacherName(updated.getTeacherName());
        existing.setTeacherAdress(updated.getTeacherAdress());
        existing.setQualification(updated.getQualification());
        existing.setAge(updated.getAge());
        existing.setDob(updated.getDob());
        existing.setExperience(updated.getExperience());
        return teacherRepo.save(existing);
    }

   
    public Teacher partialUpdate(Long id, String address) {
        Teacher teacher = teacherRepo.findById(id).orElseThrow();
        teacher.setTeacherAdress(address);
        return teacherRepo.save(teacher);
    }

   
    public void delete(Long id) {
        teacherRepo.deleteById(id);
    }

  
    public List<Teacher> getAll() {
        return teacherRepo.findAll();
    }

  
    public List<Teacher> findByExperience(int minExperience) {
        return teacherRepo.findByExperienceGreaterThanEqual(minExperience);
    }

    
    public List<Teacher> findByQualificationNative(String qualification) {
        return teacherRepo.findByQualificationNative(qualification);
    }


	
}

