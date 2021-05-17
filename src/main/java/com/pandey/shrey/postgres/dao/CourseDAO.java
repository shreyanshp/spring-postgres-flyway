package com.pandey.shrey.postgres.dao;

import com.pandey.shrey.postgres.entities.Course;
import org.springframework.data.repository.CrudRepository;
import java.util.UUID;

public interface CourseDAO extends CrudRepository<Course, UUID> {}
