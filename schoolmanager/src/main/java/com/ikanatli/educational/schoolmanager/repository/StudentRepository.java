package com.ikanatli.educational.schoolmanager.repository;

import com.ikanatli.educational.schoolmanager.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
