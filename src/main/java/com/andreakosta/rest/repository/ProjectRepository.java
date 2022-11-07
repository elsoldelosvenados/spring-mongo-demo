package com.andreakosta.rest.repository;

import com.andreakosta.rest.model.Project;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProjectRepository extends MongoRepository<Project, String> {

    Project findByShortName(String projectShortN);
}
