package org.example.service.teacher;

import lombok.RequiredArgsConstructor;
import org.example.entity.teacher.Teacher;
import org.example.repository.TeacherRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TeacherServiceImpl implements TeacherService {
    private TeacherRepository teacherRepository;

    @Override
    public void create(Teacher teacher) {
        teacherRepository.save(teacher);
    }

    @Override
    public Page<Teacher> list(int value, String column) {
        Pageable firstPageWithTenElements = PageRequest.of(value, 10);
        return teacherRepository.findAll(firstPageWithTenElements);
    }

    @Override
    public boolean delete(Long id) {
        if (!teacherRepository.existsById(id)) {
            return false;
        }
        teacherRepository.deleteById(id);
        return true;
    }
}
