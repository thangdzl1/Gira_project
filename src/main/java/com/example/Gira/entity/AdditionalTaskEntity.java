package com.example.Gira.entity;

import javax.persistence.*;

@Entity(name = "additional_task")
public class AdditionalTaskEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "desc")
    private String desc;

    @ManyToOne
    @JoinColumn(name = "performer_id")
    private UserEntity performerId;

    @ManyToOne
    @JoinColumn(name = "tasks_id")
    private TasksEntity tasks;

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

    public UserEntity getPerformerId() {
        return performerId;
    }

    public void setPerformerId(UserEntity performerId) {
        this.performerId = performerId;
    }

    public TasksEntity getTasks() {
        return tasks;
    }

    public void setTasks(TasksEntity tasks) {
        this.tasks = tasks;
    }
}
