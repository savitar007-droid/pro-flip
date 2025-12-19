package com.flipr.pro_flip.repository;


import com.flipr.pro_flip.model.Project;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProjectRepository extends MongoRepository<Project, String> {}
