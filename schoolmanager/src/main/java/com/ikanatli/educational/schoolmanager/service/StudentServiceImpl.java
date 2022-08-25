package com.ikanatli.educational.schoolmanager.service;

import com.ikanatli.educational.schoolmanager.entity.Student;
import com.ikanatli.educational.schoolmanager.repository.StudentRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService{


    @Autowired
    private final StudentRepository studentRepository;

    @Override
    public Student retrieveStudent(Long id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public List<Student> retrieveStudents() {
        return studentRepository.findAll();
    }
}
