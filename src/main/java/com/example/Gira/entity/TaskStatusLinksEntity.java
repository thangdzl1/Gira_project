package com.example.Gira.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "task_status_links")
public class TaskStatusLinksEntity {

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "source_id")
    private int source_id;

    @Column(name = "dest_id")
    private int dest_id;

    @OneToMany(mappedBy = "taskStatusLinks")
    private Set<TaskProcessEntity> taskProcess;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Set<TaskProcessEntity> getTaskProcess() {
        return taskProcess;
    }

    public void setTaskProcess(Set<TaskProcessEntity> taskProcess) {
        this.taskProcess = taskProcess;
    }

    public int getSource_id() {
        return source_id;
    }

    public void setSource_id(int source_id) {
        this.source_id = source_id;
    }

    public int getDest_id() {
        return dest_id;
    }

    public void setDest_id(int dest_id) {
        this.dest_id = dest_id;
    }
}
