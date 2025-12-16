package com.salesianostriana.dam.tarea_16_12.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Setter
@Getter
public class Enrollment {

    @EmbeddedId
    private EnrollmentPK enrollmentPK = new EnrollmentPK();

    private LocalDateTime enrolledAt;
    private EnrollmentStatus status;

    @ManyToOne
    @MapsId("user_id")
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @MapsId("course_id")
    @JoinColumn(name = "course_id")
    private Course course;


    //metodos helpers

   public void addToCourse(User u){
    u.getCourses().add(this.course);
    this.user = u;
   }

   public void removeFromCourse(User u){
       u.getCourses().remove(this.course);
   }


}
