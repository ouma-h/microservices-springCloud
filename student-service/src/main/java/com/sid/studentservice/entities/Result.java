package com.sid.studentservice.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Size(max = 4)
    private String year;
    private double GPA;

    @ManyToOne(optional = false)
    @JoinColumn(name = "student_id", nullable = false)
    @JsonIgnore
    private Student student;

}
