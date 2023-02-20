package org.example.entity.teacher;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "teachers")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "teachers_id")
    private Long id;
    private String surname;
    private String name;
    private String lastname;
    private int birthday;
    private String gender;
    private String object;
}
