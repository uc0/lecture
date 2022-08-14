package com.example.demo.homework.domain;

import lombok.Builder;
import lombok.Getter;
import org.springframework.util.StringUtils;

@Getter
@Builder
public class User {

    private String username;

    private String email;

    private int age;

    private String address;

    private String phoneNumber;

    private String gender;

    public void updateUser(UpdateUserDto updateUserDto) {
        if (StringUtils.hasText(updateUserDto.getUsername())) {
            this.username = updateUserDto.getUsername();
        }
        if (StringUtils.hasText(updateUserDto.getEmail())) {
            this.email = updateUserDto.getEmail();
        }
        if (updateUserDto.getAge() > 0) {
            this.age = updateUserDto.getAge();
        }
        if (StringUtils.hasText(updateUserDto.getAddress())) {
            this.address = updateUserDto.getAddress();
        }
        if (StringUtils.hasText(updateUserDto.getPhoneNumber())) {
            this.phoneNumber = updateUserDto.getPhoneNumber();
        }
        if (StringUtils.hasText(updateUserDto.getGender())) {
            this.gender = updateUserDto.getGender();
        }
    }

}
