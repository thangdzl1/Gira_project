package com.example.Gira.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "project_type")
public class ProjectTypeEntity {

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "desc")
    private String desc;

    @OneToMany(mappedBy = "typeId")
    private Set<ProjectEntity> projectType;

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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Set<ProjectEntity> getProjectType() {
        return projectType;
    }

    public void setProjectType(Set<ProjectEntity> projectType) {
        this.projectType = projectType;
    }

}
