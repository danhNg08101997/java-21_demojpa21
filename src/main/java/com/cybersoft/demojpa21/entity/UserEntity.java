package com.cybersoft.demojpa21.entity;

import jakarta.persistence.*;

import java.util.Set;



@Entity(name = "users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "fullname")
    private String fullName;

    @Column(name = "avatar")
    private String avatar;

    // khoá ngoại dùng để map quan hệ nên không cần khai báo cột
    // OneToOne, OneToMany, ManyToOne
    // Bảng nào chứa khoá ngoại thì cột khoá ngoại sẽ là ManyToOne và JoinColumn("tên_cột_khoá_ngoại_trong_database)
    @ManyToOne
    @JoinColumn(name = "role_id")
    private RoleEntity roleId;

    @OneToMany(mappedBy = "userId")
    private Set<TaskEntity> user;

    public RoleEntity getRoleId() {
        return roleId;
    }

    public void setRoleId(RoleEntity roleId) {
        this.roleId = roleId;
    }

    public Set<TaskEntity> getUser() {
        return user;
    }

    public void setUser(Set<TaskEntity> user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
