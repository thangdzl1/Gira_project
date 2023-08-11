package com.example.Gira.entity.ids;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ProgressInfoIds implements Serializable {
    @Column(name = "tasks_id")
    private int taskId;

    @Column(name = "performer_id")
    private int performerId;

    public ProgressInfoIds(int taskId, int performerId) {
        this.taskId = taskId;
        this.performerId = performerId;
    }

    public ProgressInfoIds() {

    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public int getPerformerId() {
        return performerId;
    }

    public void setPerformerId(int performerId) {
        this.performerId = performerId;
    }
}
