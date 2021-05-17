package com.pandey.shrey.postgres.dao;

import com.pandey.shrey.postgres.entities.Teacher;
import org.springframework.data.repository.CrudRepository;
import java.util.UUID;

public interface TeacherDAO extends CrudRepository<Teacher, UUID> {}
