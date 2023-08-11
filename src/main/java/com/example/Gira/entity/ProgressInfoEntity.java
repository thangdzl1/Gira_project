package com.example.Gira.entity;

import com.example.Gira.entity.ids.ProgressInfoIds;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

@Entity(name = "progress_info")
public class ProgressInfoEntity {
    @EmbeddedId
    private ProgressInfoIds ids;

    @ManyToOne
    @JoinColumn(name = "performer_id", insertable = false, updatable = false)
    private UserEntity user;

    @ManyToOne
    @JoinColumn(name = "tasks_id", insertable = false, updatable = false)
    private TasksEntity tasks;

    @Column(name = "start_time")
    private Date startTime;

    @Column(name = "duaration")
    private Time duaration;

    @Column(name = "content")
    private String content;

    @ManyToOne
    @JoinColumn(name = "history_info_id")
    private HistoryInfoEntity historyInfo;

    public ProgressInfoIds getIds() {
        return ids;
    }

    public void setIds(ProgressInfoIds ids) {
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

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Time getDuaration() {
        return duaration;
    }

    public void setDuaration(Time duaration) {
        this.duaration = duaration;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public HistoryInfoEntity getHistoryInfo() {
        return historyInfo;
    }

    public void setHistoryInfo(HistoryInfoEntity historyInfo) {
        this.historyInfo = historyInfo;
    }
}
