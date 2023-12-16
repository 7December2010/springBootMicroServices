package com.example.dina.demo.repository;

import com.example.dina.demo.beans.UserDetails;
import com.example.dina.demo.entity.UserEntity;
import org.hibernate.annotations.NamedQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.lang.annotation.Native;
import java.util.List;

@Repository
public interface UserDetailRepository extends JpaRepository<UserEntity, Long> {
    UserEntity getUserDetailsByEmail(String email);

    @Query(value = "Select * from USER_DETAIL", nativeQuery = true)
    List<UserEntity> getAllUserDetails();
}
