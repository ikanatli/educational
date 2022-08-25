package com.ikanatli.educational.schoolmanager.controller;

import com.ikanatli.educational.schoolmanager.entity.Student;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/ikanatli/educational/api/schoolmanager")
public interface StudentApi {

    @RequestMapping(
            value = "/{id}",
            produces = {"application/json;charset=utf-8"},
            method = RequestMethod.GET
    )
    Student retrieveStudent(@PathVariable("id") Long id);

    @RequestMapping(
            value = "/",
            produces = {"application/json;charset=utf-8"},
            method = RequestMethod.GET
    )
    List<Student> retrieveStudents();


}
