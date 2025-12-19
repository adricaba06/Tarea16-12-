package com.salesianostriana.dam.tarea_16_12.Service;

import com.salesianostriana.dam.tarea_16_12.Repository.CourseManagementRepository;
import com.salesianostriana.dam.tarea_16_12.error.CourseNameAlreadyInUse;
import com.salesianostriana.dam.tarea_16_12.error.HasNoInstructorException;
import com.salesianostriana.dam.tarea_16_12.model.Course;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.management.InstanceNotFoundException;
import java.util.ArrayList;
import java.util.List;

import static com.salesianostriana.dam.tarea_16_12.model.CourseStatus.PUBLISHED;

@Service
@AllArgsConstructor
public class CourseManagementService {

    private final CourseManagementRepository courseManagementRepository;

    public void publishCourse(Long courseId){
        List<Course> lista = new ArrayList<>();

        Course course = courseManagementRepository.findById(courseId)
                .orElseThrow(() -> new RuntimeException()); // lo quiero cambiar

        List<Course> courses = new ArrayList<>(course.getInstructor().getCourses());


        if(course.getInstructor().getCourses().isEmpty() || !course.getInstructor().getUserRole().equals("Instructor")){
            throw new HasNoInstructorException("El usuario no es un instructor");
        }

        if(course.getLessons().isEmpty()){
            throw new IllegalArgumentException();
        }

        for (int i = 0; i < course.getInstructor().getCourses().size() ; i++) {
            if(course.getName().equalsIgnoreCase(courses.get(i).getName())){
                throw new CourseNameAlreadyInUse("El nombre del curso ya existe");
            }
        }

        course.setCourseStatus(PUBLISHED);

    }

    public void addLesson( Long courseId, Long lessonData){
        
    }






}
