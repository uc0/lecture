package com.example.demo.homework.service;

import com.example.demo.homework.UserSingleton;
import com.example.demo.homework.domain.CreateUserDto;
import com.example.demo.homework.domain.UpdateUserDto;
import com.example.demo.homework.domain.User;
import com.example.demo.homework.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User createUser(CreateUserDto createUserDto) {
        Long userId = UserSingleton.getInstance().getNewId();
        User user = User.builder()
                .username(createUserDto.getUsername())
                .email(createUserDto.getEmail())
                .age(createUserDto.getAge())
                .address(createUserDto.getAddress())
                .phoneNumber(createUserDto.getPhoneNumber())
                .gender(createUserDto.getGender())
                .build();

        userRepository.save(userId, user);

        return user;
    }

    @Override
    public User readUser(Long userId) {
        return userRepository.findById(userId);
    }

    @Override
    public User updateUser(Long userId, UpdateUserDto updateUserDto) {
        User user = userRepository.findById(userId);
        if (user == null) {
            return null;
        }
        user.updateUser(updateUserDto);
        userRepository.save(userId, user);

        return user;
    }

    @Override
    public boolean deleteUser(Long userId) {
        User user = userRepository.findById(userId);
        if (user == null) {
            return false;
        }
        userRepository.deleteUser(userId);
        return true;
    }

}
