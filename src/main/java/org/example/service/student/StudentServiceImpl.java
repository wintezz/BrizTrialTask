package org.example.service.student;

import lombok.RequiredArgsConstructor;
import org.example.entity.student.Student;
import org.example.repository.StudentRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository;

    @Override
    public void create(Student student) {
        studentRepository.save(student);
    }

    @Override
    public Page<Student> list(int value, String column) {
        Pageable firstPageWithTenElements = PageRequest.of(value, 10);
        return studentRepository.findAll(firstPageWithTenElements);
    }

    @Override
    public boolean delete(Long id) {
        if (!studentRepository.existsById(id)) {
            return false;
        }
        studentRepository.deleteById(id);
        return true;
    }
}
