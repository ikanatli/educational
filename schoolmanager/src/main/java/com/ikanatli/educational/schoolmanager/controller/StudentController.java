package com.ikanatli.educational.schoolmanager.controller;

import com.ikanatli.educational.schoolmanager.entity.Student;
import com.ikanatli.educational.schoolmanager.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Access;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class StudentController implements StudentApi{

    @Autowired
    private final StudentService studentService;


    @Override
    public Student retrieveStudent(Long id) {
        return studentService.retrieveStudent(id);
    }

    @Override
    public List<Student> retrieveStudents() {
        return studentService.retrieveStudents();
    }
}
