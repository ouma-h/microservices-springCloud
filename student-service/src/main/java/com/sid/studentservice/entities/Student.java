package com.sid.studentservice.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String name;
    @NotNull
    @Size(max = 250)
    @Column(unique = true)
    private String cin;
    private String major;
    private String grade;
    private String birthdate;
    @Size(max = 8)
    private String phone;
    @Column(unique = true)
    private String email;

    @ManyToMany
    @JoinTable
    private Set<Subject> subject;
}

