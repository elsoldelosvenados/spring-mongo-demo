package com.andreakosta.rest.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Represents an entity from our applications in this case is a project.
 * @author Andres Acosta
 */
@Document(collection = "projects")
public class Project {

    @Id
    private String id;

    private String name;
    private String shortName;

    public Project() {

    }

    public Project(String name, String shortName) {
        this.name = name;
        this.shortName = shortName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }
}
