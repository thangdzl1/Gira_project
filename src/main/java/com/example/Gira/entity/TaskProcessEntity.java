package com.example.Gira.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "task_process")
public class TaskProcessEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToMany(mappedBy = "taskProcess")
    private Set<ProjectEntity> project;

    @OneToMany(mappedBy = "taskProcess")
    private Set<TasksEntity> tasks;

    @ManyToOne
    @JoinColumn(name = "task_status_links_id")
    private TaskStatusLinksEntity taskStatusLinks;

    @ManyToOne
    @JoinColumn(name = "task_status_id")
    private TaskStatusEntity taskStatus;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Set<ProjectEntity> getProject() {
        return project;
    }

    public void setProject(Set<ProjectEntity> project) {
        this.project = project;
    }

    public TaskStatusLinksEntity getTaskStatusLinks() {
        return taskStatusLinks;
    }

    public void setTaskStatusLinks(TaskStatusLinksEntity taskStatusLinks) {
        this.taskStatusLinks = taskStatusLinks;
    }

    public TaskStatusEntity getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(TaskStatusEntity taskStatus) {
        this.taskStatus = taskStatus;
    }

    public Set<TasksEntity> getTasks() {
        return tasks;
    }

    public void setTasks(Set<TasksEntity> tasks) {
        this.tasks = tasks;
    }
}
