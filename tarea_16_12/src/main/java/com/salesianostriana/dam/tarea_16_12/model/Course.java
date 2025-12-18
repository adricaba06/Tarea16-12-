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
public class Course {

    @Id
    @GeneratedValue
    private Long id;
    private String name;


    @ManyToOne()
    @JoinColumn(name = "user_id")
    private User instructor;

    @OneToMany(mappedBy = "course")
    private Set<Lesson> lessons = new HashSet<>();

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "course_category",
            joinColumns = @JoinColumn(name = "course_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id")
    )
    @Builder.Default
    private Set<Category> categories = new HashSet<>();

    @OneToMany()
    @JoinColumn(name = "enrollment_id")
    private EnrollmentPK enrollment;

    @ManyToOne()
    @JoinColumn(name = "review_id")
    private Review review;

    //metodos helper

    public void addInstructor(User instructor){
        this.instructor = instructor;
        instructor.getCourses().add(this);

    }

    public void removeInstructor() {
        if (this.instructor != null) {
            this.instructor.getCourses().remove(this);
            this.instructor = null;
        }
    }

    public void addCategory(Category category){
        this.categories = categories;
        categories.add(categories);
    }




}
