package com.example.demo.homework;


import com.example.demo.homework.domain.User;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class UserSingleton {

    private final Map<Long, User> userMap = new ConcurrentHashMap<>();

    private static final UserSingleton SINGLETON = new UserSingleton();

    private Long userId = 0L;

    private UserSingleton() {
    }

    public void save(Long id, User user) {
        userMap.put(id, user);
        userId++;
    }

    public Optional<User> findById(Long id) {
        return Optional.ofNullable(userMap.get(id));
    }

    public void delete(Long id) {
        userMap.remove(id);
    }

    public Long getNewId() {
        return userId;
    }

    public static UserSingleton getInstance() {
        return SINGLETON;
    }

}
