package org.example.service.student;

import org.example.entity.student.Student;
import org.springframework.data.domain.Page;

public interface StudentService {
    Page<Student> list(int value, String column);
    void create(Student student);
    boolean delete(Long id);
}
