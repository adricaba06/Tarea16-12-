package com.salesianostriana.dam.tarea_16_12.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Setter
@Getter
@Embeddable
public class EnrollmentPK implements Serializable {

    @Serial
    @Id
    private static final long serialVersionUID = 1L;
    private Long studentId;
    private Long courseId;






}
