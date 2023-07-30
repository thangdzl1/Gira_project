package com.example.Gira.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "task_process_links")
public class TaskProcessLinksEntity {

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "desc")
    private String desc;

    @ManyToOne
    @JoinColumn(name = "source_id")
    private TaskProcessEntity sourceId;

    @ManyToOne
    @JoinColumn(name = "dest_id")
    private TaskProcessEntity destId;

    @OneToMany(mappedBy = "taskLinkId")
    private Set<TasksEntity> tasksEntity;

    public Set<TasksEntity> getTasksEntity() {
        return tasksEntity;
    }

    public void setTasksEntity(Set<TasksEntity> tasksEntity) {
        this.tasksEntity = tasksEntity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public TaskProcessEntity getSourceId() {
        return sourceId;
    }

    public void setSourceId(TaskProcessEntity sourceId) {
        this.sourceId = sourceId;
    }

    public TaskProcessEntity getDestId() {
        return destId;
    }

    public void setDestId(TaskProcessEntity destId) {
        this.destId = destId;
    }
}
