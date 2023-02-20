package org.example.service.form;

import lombok.RequiredArgsConstructor;
import org.example.entity.form.Form;
import org.example.repository.FormRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FormServiceImpl implements FormService {
    private FormRepository formRepository;

    @Override
    public void create(Form form) {
        formRepository.save(form);
    }

    @Override
    public Page<Form> list(int value, String column) {
        Pageable firstPageWithTenElements = PageRequest.of(value, 10);
        return formRepository.findAll(firstPageWithTenElements);
    }

    @Override
    public boolean delete(Long id) {
        if (!formRepository.existsById(id)) {
            return false;
        }
        formRepository.deleteById(id);
        return true;
    }
}
