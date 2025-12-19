package com.salesianostriana.dam.tarea_16_12.Repository;

import com.salesianostriana.dam.tarea_16_12.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseManagementRepository extends JpaRepository<Course, Long> {

}
