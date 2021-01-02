package com.sid.studentservice.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Absence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String date;

    @ManyToOne(optional = false)
    @JoinColumn(name = "student_id", nullable = false)
    @JsonIgnore
    private Student student;

    @ManyToOne(optional = false)
    @JoinColumn(name = "subject_id", nullable = false)
    @JsonIgnore
    private Subject subject;
}
