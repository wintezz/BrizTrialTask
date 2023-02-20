package org.example.repository;

import org.example.entity.form.Form;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormRepository extends PagingAndSortingRepository<Form, Long> {
}
