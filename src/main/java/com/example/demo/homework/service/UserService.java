package com.example.demo.homework.service;

import com.example.demo.homework.domain.CreateUserDto;
import com.example.demo.homework.domain.UpdateUserDto;
import com.example.demo.homework.domain.User;

public interface UserService {

    User createUser(CreateUserDto createUserDto);

    User readUser(Long userId);

    User updateUser(Long userId, UpdateUserDto updateUserDto);

    boolean deleteUser(Long userId);

}
