package com.example.Gira.entity;


import javax.persistence.*;
import java.util.Set;

@Entity(name = "tasks")
public class TasksEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "desc")
    private String desc;

    @ManyToOne
    @JoinColumn(name = "task_status_id")
    private TaskProcessEntity taskStatusId;

    @ManyToOne
    @JoinColumn(name = "task_link_id")
    private TaskProcessLinksEntity taskLinkId;

    public int getId() {
        return id;
    }

    @OneToMany(mappedBy = "taskId")
    private Set<ProjectEntity> projectEntities;

    public Set<ProjectEntity> getProjectEntities() {
        return projectEntities;
    }

    public void setProjectEntities(Set<ProjectEntity> projectEntities) {
        this.projectEntities = projectEntities;
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

    public TaskProcessEntity getTaskStatusId() {
        return taskStatusId;
    }

    public void setTaskStatusId(TaskProcessEntity taskStatusId) {
        this.taskStatusId = taskStatusId;
    }

    public TaskProcessLinksEntity getTaskLinkId() {
        return taskLinkId;
    }

    public void setTaskLinkId(TaskProcessLinksEntity taskLinkId) {
        this.taskLinkId = taskLinkId;
    }
}
