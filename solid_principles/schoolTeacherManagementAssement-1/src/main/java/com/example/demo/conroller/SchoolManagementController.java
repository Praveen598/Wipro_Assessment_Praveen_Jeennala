package com.example.demo.conroller;

import com.example.demo.entity.School;
import com.example.demo.entity.Teacher;
import com.example.demo.service.SchoolService;
import com.example.demo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class SchoolManagementController {

    @Autowired
    private SchoolService schoolService;

    @Autowired
    private TeacherService teacherService;

  //school

    @PostMapping("/schoolSave")
    public School createSchool(@RequestBody School school) {
        return schoolService.save(school);
    }

    @PutMapping("/schoolUpdate/{id}")
    public School updateSchool(@PathVariable Long id, @RequestBody School school) {
        return schoolService.update(id, school);
    }

    @PatchMapping("/schoolsPatchUpdate/{id}")
    public School partialUpdateSchool(@PathVariable Long id, @RequestParam String name) {
        return schoolService.partialUpdate(id, name);
    }

    @DeleteMapping("/schoolDelete/{id}")
    public void deleteSchool(@PathVariable Long id) {
        schoolService.delete(id);
    }

    @GetMapping("/schoolGetAll")
    public List<School> getAllSchools() {
        return schoolService.getAll();
    }

    @GetMapping("/schoolSearchByName/{name}")
    public List<School> searchSchoolByName(@PathVariable String name) {
        return schoolService.searchByName(name);
    }

    @GetMapping("/findSchoolsByTeacher/{teacher}")
    public List<School> findSchoolsByTeacher(@PathVariable String teacher) {
        return schoolService.findByTeacherName(teacher);
    }

    //TEACHER 

    @PostMapping("/saveTeachers")
    public Teacher createTeacher(@RequestBody Teacher teacher) {
        return teacherService.save(teacher);
    }

    @PutMapping("/updateTeacher/{id}")
    public Teacher updateTeacher(@PathVariable Long id, @RequestBody Teacher teacher) {
        return teacherService.update(id, teacher);
    }

    @PatchMapping("/partialUpdateTeacher/{id}")
    public Teacher partialUpdateTeacher(@PathVariable Long id, @RequestParam String address) {
        return teacherService.partialUpdate(id, address);
    }

    @DeleteMapping("/deleteTeacher/{id}")
    public void deleteTeacher(@PathVariable Long id) {
        teacherService.delete(id);
    }
//    @DeleteMapping("/deleteTeacherByName/{teacherName}")
//    public void deleteTeacherByName(@PathVariable String teacherName) {
//    	  teacherService.deleteByName(teacherName);
//    }

    @GetMapping("/getAllTeachers")
    public List<Teacher> getAllTeachers() {
        return teacherService.getAll();
    }

    @GetMapping("/findTeachersByExperience/{years}")
    public List<Teacher> findTeachersByExperience(@PathVariable int years) {
        return teacherService.findByExperience(years);
    }


    @GetMapping("/findTeachersByQualification/{qualify}")
    public List<Teacher> findTeachersByQualification(@PathVariable String qualify) {
        return teacherService.findByQualificationNative(qualify);
    }
}
