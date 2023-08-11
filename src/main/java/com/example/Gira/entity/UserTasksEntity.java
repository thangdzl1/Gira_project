package com.example.Gira.entity;

import com.example.Gira.entity.ids.UserTasksIds;

import javax.persistence.*;

@Entity(name = "user_tasks")
public class UserTasksEntity {
    @EmbeddedId
    private UserTasksIds ids;

    @ManyToOne
    @JoinColumn(name = "user_id", insertable = false, updatable = false)
    private UserEntity user;

    @ManyToOne
    @JoinColumn(name = "tasks_id", insertable = false, updatable = false)
    private TasksEntity tasks;

    public UserTasksIds getIds() {
        return ids;
    }

    public void setIds(UserTasksIds ids) {
        this.ids = ids;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public TasksEntity getTasks() {
        return tasks;
    }

    public void setTasks(TasksEntity tasks) {
        this.tasks = tasks;
    }
}
