package org.example.service.teacher;


import org.example.entity.teacher.Teacher;
import org.springframework.data.domain.Page;

public interface TeacherService {
    Page<Teacher> list(int value, String column);
    void create(Teacher teacher);
    boolean delete(Long id);
}
