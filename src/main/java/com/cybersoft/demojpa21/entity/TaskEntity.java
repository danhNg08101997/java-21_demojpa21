package com.cybersoft.demojpa21.entity;

import jakarta.persistence.*;

@Entity(name = "tasks")
public class TaskEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "start_date")
    private String startDate;
    @Column(name = "end_date")
    private String endDate;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity userId;
    @ManyToOne
    @JoinColumn(name = "job_id")
    private JobEntity jobId;
    @ManyToOne
    @JoinColumn(name = "status_id")
    private StatusEntity statusId;

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

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public UserEntity getUserId() {
        return userId;
    }

    public void setUserId(UserEntity userId) {
        this.userId = userId;
    }

    public JobEntity getJobId() {
        return jobId;
    }

    public void setJobId(JobEntity jobId) {
        this.jobId = jobId;
    }

    public StatusEntity getStatusId() {
        return statusId;
    }

    public void setStatusId(StatusEntity statusId) {
        this.statusId = statusId;
    }
}
