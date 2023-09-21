package com.example.Gira.entity;


import javax.persistence.*;
import java.util.Set;

@Entity(name = "tasks")
public class TasksEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "manager_id")
    private UserEntity manager;

    @ManyToOne
    @JoinColumn(name = "task_status_id")
    private TaskStatusEntity taskStatus;

    @ManyToOne
    @JoinColumn(name = "tasks_type_id")
    private TaskTypeEntity taskType;

    @ManyToOne
    @JoinColumn(name = "basic_info_id")
    private BasicInfoEntity basicInfo;

    @ManyToOne
    @JoinColumn(name = "plan_info_id")
    private PlanInfoEntity planInfo;

    @ManyToOne
    @JoinColumn(name = "history_info_id")
    private HistoryInfoEntity historyInfo;

    @OneToMany(mappedBy = "tasks")
    private Set<AdditionalTaskEntity> additionalTask;

    @OneToMany(mappedBy = "taskId")
    private Set<CommentInfoEntity> commentInfo;

    @OneToMany(mappedBy = "tasks")
    private Set<ProgressInfoEntity> progressInfo;

    public Set<ProgressInfoEntity> getProgressInfo() {
        return progressInfo;
    }

    public void setProgressInfo(Set<ProgressInfoEntity> progressInfo) {
        this.progressInfo = progressInfo;
    }

    public Set<AdditionalTaskEntity> getAdditionalTask() {
        return additionalTask;
    }

    public void setAdditionalTask(Set<AdditionalTaskEntity> additionalTask) {
        this.additionalTask = additionalTask;
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

    public UserEntity getManager() {
        return manager;
    }

    public void setManager(UserEntity manager) {
        this.manager = manager;
    }

    public TaskStatusEntity getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(TaskStatusEntity taskStatus) {
        this.taskStatus = taskStatus;
    }

    public TaskTypeEntity getTaskType() {
        return taskType;
    }

    public void setTaskType(TaskTypeEntity taskType) {
        this.taskType = taskType;
    }

    public BasicInfoEntity getBasicInfo() {
        return basicInfo;
    }

    public void setBasicInfo(BasicInfoEntity basicInfo) {
        this.basicInfo = basicInfo;
    }

    public PlanInfoEntity getPlanInfo() {
        return planInfo;
    }

    public void setPlanInfo(PlanInfoEntity planInfo) {
        this.planInfo = planInfo;
    }

    public HistoryInfoEntity getHistoryInfo() {
        return historyInfo;
    }

    public void setHistoryInfo(HistoryInfoEntity historyInfo) {
        this.historyInfo = historyInfo;
    }
}
