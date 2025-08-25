package com.example.demo.service;

import com.example.demo.entity.School;
import com.example.demo.repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolService {

    @Autowired
    private SchoolRepository schoolRepo;

    public School save(School school) {
        return schoolRepo.save(school);
    }

    public School update(Long id, School updated) {
        School existing = schoolRepo.findById(id).orElseThrow();
        existing.setSchoolName(updated.getSchoolName());
        existing.setSchoolAdress(updated.getSchoolAdress());
        existing.setTeachers(updated.getTeachers());
        return schoolRepo.save(existing);
    }

    public School partialUpdate(Long id, String name) {
        School school = schoolRepo.findById(id).orElseThrow();
        school.setSchoolName(name);
        return schoolRepo.save(school);
    }

    public void delete(Long id) {
        schoolRepo.deleteById(id);
    }

    public List<School> getAll() {
        return schoolRepo.findAll();
    }
    public List<School> findByTeacherName(String name) {
        return schoolRepo.findSchoolsByTeacherName(name);
    }

    
    public List<School> searchByName(String keyword) {
        return schoolRepo.findBySchoolNameContaining(keyword);
    }
}

