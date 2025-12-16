package com.salesianostriana.dam.tarea_16_12.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Setter
@Getter
public class Category {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToMany(mappedBy = "categories")
    @Builder.Default
    @ToString.Exclude
    private Set<Course> courses = new HashSet<>();

}
