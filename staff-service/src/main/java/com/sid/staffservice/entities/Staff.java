package com.sid.staffservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean is_admin;
    @NotNull
    private String name;
    @NotNull
    @Size(max = 250)
    private String cin;
    private String birthdate;
    @Size(max = 8)
    private String phone;
    @Column(unique = true)
    private String email;
    private String role;

}
