package com.andreakosta.rest.service.implementations;

import com.andreakosta.rest.model.Project;
import com.andreakosta.rest.repository.ProjectRepository;
import com.andreakosta.rest.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImplementation implements ProjectService {

    @Autowired
    ProjectRepository projectRepository;

    @Override
    public List<Project> findAll() {
        return projectRepository.findAll();
    }

    @Override
    public Project findByProjectShortName(String shortName) {
       return  projectRepository.findByShortName(shortName);
    }

    @Override
    public Project save(Project project){
        return projectRepository.save(project);
    }
}
