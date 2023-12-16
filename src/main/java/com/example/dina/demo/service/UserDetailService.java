package com.example.dina.demo.service;

import com.example.dina.demo.beans.UserDetails;
import com.example.dina.demo.entity.UserEntity;
import com.example.dina.demo.repository.UserDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class UserDetailService {
    @Autowired
    private UserDetailRepository repository;

    public UserDetails getUserDetailByEmailId(String email) {
        // UserDetails userModel = new UserDetails();
        UserEntity entity = repository.getUserDetailsByEmail(email);
        return new UserDetails(entity.getId(), entity.getFirstName(), entity.getLastName(), entity.getEmail(), entity.getAddress());
    }

    public List<UserDetails> getAllUserDetails() {
        List<UserDetails> userDetails = new ArrayList<>();
        List<UserEntity> userEntities = repository.getAllUserDetails();
        if(!Objects.isNull(userEntities))
            userEntities.forEach(userEnt ->{
                UserDetails user = new UserDetails();
                user.setId(userEnt.getId());
                user.setFirstName(userEnt.getFirstName());
                user.setLastName(userEnt.getLastName());
                user.setEmail(userEnt.getEmail());
                user.setAddress(userEnt.getAddress());
                userDetails.add(user);
            });
        return userDetails;
    }
}
