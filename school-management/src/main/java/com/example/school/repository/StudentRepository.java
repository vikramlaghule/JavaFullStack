package com.example.school.repository;

import com.example.school.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findBySchoolId(Long schoolId);
    List<Student> findByTeacherId(Long teacherId);
}
