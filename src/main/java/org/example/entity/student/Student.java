package org.example.entity.student;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "students_id")
    private Long id;
    private String surname;
    private String name;
    private String lastname;
    private int birthday;
    private String gender;
}
