package org.example.entity.form;

import lombok.*;
import org.example.entity.student.Student;
import org.example.entity.teacher.Teacher;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "forms")
public class Form {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int year;
    private String code;
    @OneToOne
    @JoinColumn(name = "teachers_id")
    private Teacher teacher;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "students_id")
    private List<Student> students = new ArrayList<>();
}
