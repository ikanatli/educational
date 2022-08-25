package com.ikanatli.educational.schoolmanager.service;

import com.ikanatli.educational.schoolmanager.entity.Student;

import java.util.List;

public interface StudentService {

    Student retrieveStudent(Long id);

    List<Student> retrieveStudents();

}
