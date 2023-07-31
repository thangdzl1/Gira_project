package com.example.Gira.entity;


import javax.persistence.*;

@Entity(name = "project")
public class ProjectEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "icon")
    private String icon;

    @ManyToOne
    @JoinColumn(name = "creator_id")
    private UserEntity creatorId;

    @ManyToOne
    @JoinColumn(name = "manager_id")
    private UserEntity managerId;

    @ManyToOne
    @JoinColumn(name = "project_type_id")
    private ProjectTypeEntity typeId;

    @ManyToOne
    @JoinColumn(name = "task_id")
    private TasksEntity taskId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public UserEntity getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(UserEntity creatorId) {
        this.creatorId = creatorId;
    }

    public UserEntity getManagerId() {
        return managerId;
    }

    public void setManagerId(UserEntity managerId) {
        this.managerId = managerId;
    }

    public ProjectTypeEntity getTypeId() {
        return typeId;
    }

    public void setTypeId(ProjectTypeEntity typeId) {
        this.typeId = typeId;
    }

    public TasksEntity getTaskId() {
        return taskId;
    }

    public void setTaskId(TasksEntity taskId) {
        this.taskId = taskId;
    }
}
