package com.example.demo.homework.repository;

import com.example.demo.homework.domain.User;

public interface UserRepository {

    User save(Long id, User user);

    User findById(Long id);

    void deleteUser(Long id);

}
