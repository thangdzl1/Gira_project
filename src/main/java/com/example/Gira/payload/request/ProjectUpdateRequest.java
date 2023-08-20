package com.example.Gira.payload.request;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class ProjectUpdateRequest {
    @NotNull(message = "id not null")
    private int id;

    @NotNull(message = "name not null")
    @NotEmpty(message = "name not empty")
    private String name;

    @NotNull(message = "icon not null")
    @NotEmpty(message = "icon not empty")
    private String icon;

    @NotNull(message = "manager_id not null")
    private int manager_id;

    @NotNull(message = "project_type_id not null")
    private int project_type_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public int getManager_id() {
        return manager_id;
    }

    public void setManager_id(int manager_id) {
        this.manager_id = manager_id;
    }

    public int getProject_type_id() {
        return project_type_id;
    }

    public void setProject_type_id(int project_type_id) {
        this.project_type_id = project_type_id;
    }


}
