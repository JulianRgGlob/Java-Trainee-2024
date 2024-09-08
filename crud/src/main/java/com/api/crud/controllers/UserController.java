package com.api.crud.controllers;

import com.api.crud.dto.UserDto;
import com.api.crud.dto.UserDto;
import com.api.crud.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/{uuid}")
    public Optional<UserDto> getUserById(@PathVariable UUID uuid){
        return userService.getUser(uuid);
    }
    @GetMapping()
    public ResponseEntity<List<UserDto>> getAllUsers() {
        List<UserDto> users = userService.getAllUsers();
        return ResponseEntity.ok(users);
    }
    @PostMapping
    public ResponseEntity<UserDto> saveUser(@RequestBody UserDto userDto){
        UserDto users = userService.saveUser(userDto);
        return ResponseEntity.ok(users);
    }
    @PutMapping("/{uuid}")
    public ResponseEntity<UserDto> updateUserById(@RequestBody UserDto request, @PathVariable UUID uuid){
        UserDto users = userService.updateById(request,uuid);
        return ResponseEntity.ok(users);
    }
    @DeleteMapping("/{uuid}")
    public ResponseEntity<String> deleteById(@PathVariable UUID uuid){
        boolean users = userService.deleteById(uuid);
        boolean ok = users;
        if (ok){
            return ResponseEntity.ok("User Deleted");
        }else {
            return ResponseEntity.ok("error "+users);
        }
    }
}
