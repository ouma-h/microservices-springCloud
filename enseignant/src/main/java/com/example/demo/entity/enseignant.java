package com.example.demo.entity;

import com.sun.istack.NotNull;
import lombok.*;
import org.hibernate.annotations.BatchSize;

import javax.persistence.*;
import java.util.Set;

@Entity

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class enseignant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    @NotNull
    private String name;
    @NotNull
    @Column(unique = true)
    private String cin;

    @Column(unique = true)
    private String email;

    private String phone;
    private String birthdate;
    private String date_emb;
    private String specialty;



}

