package com.example.demo.homework.controller;

import com.example.demo.homework.domain.CreateUserDto;
import com.example.demo.homework.domain.UpdateUserDto;
import com.example.demo.homework.domain.User;
import com.example.demo.homework.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<?> createUser(CreateUserDto createUserDto) {
        return ResponseEntity.created(null).body(userService.createUser(createUserDto));
    }

    @GetMapping(value = "/{userId}")
    public ResponseEntity<?> readUser(@PathVariable Long userId) {  // FIXME: Long과 long의 차이점
        User user = userService.readUser(userId);

        if (user == null) {
            return ResponseEntity.badRequest().body("아이디에 해당하는 사용자를 찾을 수 없습니다.");
        }
        return ResponseEntity.ok().body(user);
    }

    @PatchMapping(value = "/{userId}")
    public ResponseEntity<?> updateUser(@PathVariable Long userId, @RequestBody UpdateUserDto updateUserDto) {
        User user = userService.updateUser(userId, updateUserDto);

        if (user == null) {
            return ResponseEntity.badRequest().body("아이디에 해당하는 사용자를 찾을 수 없습니다.");
        }
        return ResponseEntity.ok().body(user);
    }

    @DeleteMapping(value = "/{userId}")
    public ResponseEntity<?> deleteUser(@PathVariable Long userId) {
        if (!userService.deleteUser(userId)) {
            return ResponseEntity.badRequest().body("아이디에 해당하는 사용자를 찾을 수 없습니다.");
        }
        return ResponseEntity.ok().body("사용자 삭제 완료");
    }

}
