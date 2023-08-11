package com.example.Gira.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity(name = "comment_info")
public class CommentInfoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "cmt_time")
    private Date cmtTime;

    @Column(name = "last_update")
    private Date lastUpdate;

    @Column(name = "content")
    private String content;

    @ManyToOne
    @JoinColumn(name = "writter_id")
    private UserEntity writterId;

    @ManyToOne
    @JoinColumn(name = "ans_id")
    private CommentInfoEntity ansId;

    @ManyToOne
    @JoinColumn(name = "task_id")
    private TasksEntity taskId;

    @ManyToOne
    @JoinColumn(name = "history_info_id")
    private HistoryInfoEntity historyInfo;

    @OneToMany(mappedBy = "ansId")
    private Set<CommentInfoEntity> commentInfo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCmtTime() {
        return cmtTime;
    }

    public void setCmtTime(Date cmtTime) {
        this.cmtTime = cmtTime;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public UserEntity getWritterId() {
        return writterId;
    }

    public void setWritterId(UserEntity writterId) {
        this.writterId = writterId;
    }

    public CommentInfoEntity getAnsId() {
        return ansId;
    }

    public void setAnsId(CommentInfoEntity ansId) {
        this.ansId = ansId;
    }

    public TasksEntity getTaskId() {
        return taskId;
    }

    public void setTaskId(TasksEntity taskId) {
        this.taskId = taskId;
    }

    public HistoryInfoEntity getHistoryInfo() {
        return historyInfo;
    }

    public void setHistoryInfo(HistoryInfoEntity historyInfo) {
        this.historyInfo = historyInfo;
    }

    public Set<CommentInfoEntity> getCommentInfo() {
        return commentInfo;
    }

    public void setCommentInfo(Set<CommentInfoEntity> commentInfo) {
        this.commentInfo = commentInfo;
    }
}
