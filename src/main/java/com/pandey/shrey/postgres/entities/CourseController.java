package com.pandey.shrey.postgres.entities;

import com.pandey.shrey.postgres.dao.CourseDAO;
import com.pandey.shrey.postgres.dao.TeacherDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class CourseController {

    @Autowired
    private CourseDAO courseDAO;
    private TeacherDAO teacherDAO;
    private Teacher teacher;


    // POST method to create a teacher
    @PostMapping("/teachers")
    public Teacher createTeacher(@RequestBody Teacher teacher) {
        return teacherDAO.save(teacher);
    }

}
