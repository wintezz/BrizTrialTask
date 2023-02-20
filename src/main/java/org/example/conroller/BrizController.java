package org.example.conroller;

import lombok.RequiredArgsConstructor;
import org.example.entity.form.Form;
import org.example.entity.student.Student;
import org.example.entity.teacher.Teacher;
import org.example.service.form.FormServiceImpl;
import org.example.service.student.StudentServiceImpl;
import org.example.service.teacher.TeacherServiceImpl;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/school_task")
public class BrizController {
    private TeacherServiceImpl teacherService;
    private StudentServiceImpl studentService;
    private FormServiceImpl formService;

    @PostMapping(value = "/students")
    public ResponseEntity<?> createStudent(@RequestBody Student student) {
        studentService.create(student);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PostMapping(value = "/teachers")
    public ResponseEntity<?> createTeacher(@RequestBody Teacher teacher) {
        teacherService.create(teacher);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PostMapping(value = "/forms")
    public ResponseEntity<?> createForm(@RequestBody Form form) {
        formService.create(form);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/teachers/page={value}sort={column}")
    public Page<Teacher> getTeachers(@PathVariable int value, @PathVariable String column) {
        return teacherService.list(value, column);
    }

    @GetMapping("/students/page={value}sort={column}")
    public Page<Student> getStudents(@PathVariable int value, @PathVariable String column) {
        return studentService.list(value, column);
    }

    @GetMapping("/forms/page={value}sort={column}")
    public Page<Form> getForms(@PathVariable int value, @PathVariable String column) {
        return formService.list(value, column);
    }

    @DeleteMapping(value = "/students/{id}")
    public ResponseEntity<?> deleteStudent(@PathVariable(name = "id") Long id) {
        final boolean deleted = studentService.delete(id);

        return deleted
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }

    @DeleteMapping(value = "/teachers/{id}")
    public ResponseEntity<?> deleteTeacher(@PathVariable(name = "id") Long id) {
        final boolean deleted = teacherService.delete(id);

        return deleted
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }

    @DeleteMapping(value = "/forms/{id}")
    public ResponseEntity<?> deleteForm(@PathVariable(name = "id") Long id) {
        final boolean deleted = formService.delete(id);

        return deleted
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }
}
