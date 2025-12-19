package com.salesianostriana.dam.tarea_16_12.model;


import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Setter
@Getter
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String email;
    private double average_grade;
    private UserRole userRole;

    @OneToMany(mappedBy = "instructor")
    @Builder.Default
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Set<Course> courses = new HashSet<>();

    @OneToMany(mappedBy = "")
    private Review review;





}
