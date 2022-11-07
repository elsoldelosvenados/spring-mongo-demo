package com.andreakosta.rest.service;

import com.andreakosta.rest.model.Project;

import java.util.List;

public interface ProjectService {

    List<Project> findAll();

    Project findByProjectShortName(String shortName);

    Project save(Project project);

}
