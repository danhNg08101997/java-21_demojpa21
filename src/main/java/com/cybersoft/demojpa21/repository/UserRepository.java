package com.cybersoft.demojpa21.repository;

import com.cybersoft.demojpa21.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;



@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    List<UserEntity> findByEmailAndPassword(String email, String password);

    //Câu query là của thư viện ORM chứ không phải câu query thuần của CSDL đang sử dụng
    @Query("select u from users as u where u.email=?1 and u.password = ?2")
    List<UserEntity> findUserEmailPassword(String email, String password);
}
