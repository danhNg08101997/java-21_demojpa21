package com.cybersoft.demojpa21.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Set;

@Entity(name = "roles")
public class RoleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String desc;

    // @OneToMany
    // mappedBy: Nhận vào tên biến bên Entity map khoá ngoại
    @OneToMany(mappedBy = "roleId")
    @JsonIgnore
    private Set<UserEntity> role;

    public Set<UserEntity> getRole() {
        return role;
    }

    public void setRole(Set<UserEntity> role) {
        this.role = role;
    }

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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
