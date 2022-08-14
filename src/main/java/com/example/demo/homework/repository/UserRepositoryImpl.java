package com.example.demo.homework.repository;

import com.example.demo.homework.UserSingleton;
import com.example.demo.homework.domain.User;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class UserRepositoryImpl implements UserRepository {

    @Override
    public User save(Long id, User user) {
        UserSingleton.getInstance().save(id, user);
        return user;
    }

    @Override
    public User findById(Long id) {
        Optional<User> oUser = UserSingleton.getInstance().findById(id);

        if (oUser.isEmpty()) {
            return null;
        } else {
            return oUser.get();
        }
    }

    @Override
    public void deleteUser(Long id) {
        UserSingleton.getInstance().delete(id);
    }

}
