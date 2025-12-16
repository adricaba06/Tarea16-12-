package com.salesianostriana.dam.tarea_16_12.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Setter
@Getter
public class Review {
    @Id
    @GeneratedValue
    private Long id;
}
