package com.yoho.blamarket.repository;

import com.yoho.blamarket.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, String> {

    List<UserEntity> findAll();

    UserEntity findByEmail(String email);


}
