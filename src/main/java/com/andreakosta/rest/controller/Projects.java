package com.andreakosta.rest.controller;

import com.andreakosta.rest.model.Project;
import com.andreakosta.rest.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Handles the HTTP requests for the projects.
 * @author Andres Acosta
* */
@RestController
@RequestMapping("/projects")
public class Projects {

    @Autowired
    private ProjectService projectService;

    @GetMapping()
    public List<Project> getAllProjects(){
        return projectService.findAll();
    }

    @PostMapping()
    public Project saveProject(@RequestBody Project project){
        return projectService.save(project);
    }
}
