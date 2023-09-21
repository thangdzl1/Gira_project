package com.example.Gira.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "task_status")
public class TaskStatusEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "sequence_number")
    private int sequenceNumber;

    @OneToMany(mappedBy = "taskStatus")
    private Set<TaskProcessEntity> taskProcess;

    @OneToMany(mappedBy = "taskStatus")
    private Set<TasksEntity> tasks;

    public Set<TasksEntity> getTasks() {
        return tasks;
    }

    public void setTasks(Set<TasksEntity> tasks) {
        this.tasks = tasks;
    }

    public Set<TaskProcessEntity> getTaskProcess() {
        return taskProcess;
    }

    public void setTaskProcess(Set<TaskProcessEntity> taskProcess) {
        this.taskProcess = taskProcess;
    }

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

    public int getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(int sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

}
