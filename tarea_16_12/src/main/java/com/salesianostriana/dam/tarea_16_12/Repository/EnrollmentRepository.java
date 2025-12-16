package com.salesianostriana.dam.tarea_16_12.Repository;

import com.salesianostriana.dam.tarea_16_12.model.Enrollment;
import com.salesianostriana.dam.tarea_16_12.model.EnrollmentPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnrollmentRepository extends JpaRepository<Enrollment, EnrollmentPK> {

}
