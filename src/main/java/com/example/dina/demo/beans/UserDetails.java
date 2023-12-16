package com.example.dina.demo.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDetails {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
}
