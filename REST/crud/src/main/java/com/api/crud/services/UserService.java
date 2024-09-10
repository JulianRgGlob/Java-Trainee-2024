package com.api.crud.services;

import com.api.crud.dto.UserDto;
import com.api.crud.models.entity.UserModel;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
public interface UserService {

    Optional<UserDto> getUser(UUID uuid);
    List<UserDto> getAllUsers();
    UserDto saveUser(UserDto userDto);
    UserDto updateById(UserDto userDto,UUID uuid);
    boolean deleteById (UUID uuid);
}

