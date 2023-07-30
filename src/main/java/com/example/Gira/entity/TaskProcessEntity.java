package com.example.Gira.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "task_process")
public class TaskProcessEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "status_name")
    private String StatusName;

    @Column(name = "sequence_number")
    private String SequenceNumber;

    @OneToMany(mappedBy = "taskStatusId")
    private Set<TasksEntity> taskStatusId;

    @OneToMany(mappedBy = "sourceId")
    private Set<TaskProcessLinksEntity> sourceId;

    @OneToMany(mappedBy = "destId")
    private Set<TaskProcessLinksEntity> destId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatusName() {
        return StatusName;
    }

    public void setStatusName(String statusName) {
        StatusName = statusName;
    }

    public String getSequenceNumber() {
        return SequenceNumber;
    }

    public void setSequenceNumber(String sequenceNumber) {
        SequenceNumber = sequenceNumber;
    }

    public Set<TasksEntity> getTaskStatusId() {
        return taskStatusId;
    }

    public void setTaskStatusId(Set<TasksEntity> taskStatusId) {
        this.taskStatusId = taskStatusId;
    }

    public Set<TaskProcessLinksEntity> getSourceId() {
        return sourceId;
    }

    public void setSourceId(Set<TaskProcessLinksEntity> sourceId) {
        this.sourceId = sourceId;
    }

    public Set<TaskProcessLinksEntity> getDestId() {
        return destId;
    }

    public void setDestId(Set<TaskProcessLinksEntity> destId) {
        this.destId = destId;
    }
}
