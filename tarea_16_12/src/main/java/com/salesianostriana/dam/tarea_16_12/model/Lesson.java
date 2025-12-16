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
public class Lesson {
    @Id
    @GeneratedValue
    private Long id;



    @ManyToOne()
    @JoinColumn(name = "course_id")
    private Course course;
}
