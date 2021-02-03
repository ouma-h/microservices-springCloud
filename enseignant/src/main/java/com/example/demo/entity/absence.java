package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class absence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String date;

    @ManyToOne(optional = false)
    @JoinColumn(name = "enseignant_id" , nullable = false)
    @JsonIgnore
    private enseignant enseignant;

    @ManyToOne(optional = false)
    @JoinColumn(name = "subject_id" , nullable = false)
    @JsonIgnore
    private subject subject;










}
