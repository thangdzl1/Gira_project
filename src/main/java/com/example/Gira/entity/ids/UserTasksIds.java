package com.example.Gira.entity.ids;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class UserTasksIds implements Serializable {
    @Column(name = "user_id")
    private int userId;

    @Column(name = "tasks_id")
    private int tasksId;

    public UserTasksIds(int userId, int tasksId) {
        this.userId = userId;
        this.tasksId = tasksId;
    }

    public UserTasksIds() {

    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getTasksId() {
        return tasksId;
    }

    public void setTasksId(int tasksId) {
        this.tasksId = tasksId;
    }
}
