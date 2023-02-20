package org.example.service.form;

import org.example.entity.form.Form;
import org.springframework.data.domain.Page;

public interface FormService {
    Page<Form> list(int value, String column);
    void create(Form form);
    boolean delete(Long id);
}

