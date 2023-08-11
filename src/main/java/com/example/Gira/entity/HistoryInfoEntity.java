package com.example.Gira.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity(name = "history_info")
public class HistoryInfoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "changed_time")
    private Date changedTime;

    @Column(name = "prev_content")
    private String prevContent;

    @Column(name = "new_content")
    private String newContent;

    @ManyToOne
    @JoinColumn(name = "changer_id")
    private UserEntity changerId;

    @OneToMany(mappedBy = "historyInfo")
    private Set<TasksEntity> tasks;

    @OneToMany(mappedBy = "historyInfo")
    private Set<ProgressInfoEntity> progressInfo;

    @OneToMany(mappedBy = "historyInfo")
    private Set<CommentInfoEntity> commentInfo;

    public UserEntity getChangerId() {
        return changerId;
    }

    public void setChangerId(UserEntity changerId) {
        this.changerId = changerId;
    }

    public Set<ProgressInfoEntity> getProgressInfo() {
        return progressInfo;
    }

    public void setProgressInfo(Set<ProgressInfoEntity> progressInfo) {
        this.progressInfo = progressInfo;
    }

    public Set<CommentInfoEntity> getCommentInfo() {
        return commentInfo;
    }

    public void setCommentInfo(Set<CommentInfoEntity> commentInfo) {
        this.commentInfo = commentInfo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getChangedTime() {
        return changedTime;
    }

    public void setChangedTime(Date changedTime) {
        this.changedTime = changedTime;
    }

    public String getPrevContent() {
        return prevContent;
    }

    public void setPrevContent(String prevContent) {
        this.prevContent = prevContent;
    }

    public String getNewContent() {
        return newContent;
    }

    public void setNewContent(String newContent) {
        this.newContent = newContent;
    }

    public Set<TasksEntity> getTasks() {
        return tasks;
    }

    public void setTasks(Set<TasksEntity> tasks) {
        this.tasks = tasks;
    }
}
