package com.api.crud.services;

import com.api.crud.dto.UserDto;
import com.api.crud.models.entity.UserModel;
import com.api.crud.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Optional<UserDto> getUser(UUID uuid) {
        return userRepository.findById(uuid).map(userModel -> new UserDto(
                userModel.getId(),
                userModel.getName(),
                userModel.getLastName(),
                userModel.getNumber()
        ));
    }

    @Override
    public List<UserDto> getAllUsers() {
        return userRepository.findAll().stream().map(userModel -> new UserDto(
                userModel.getId(),
                userModel.getName(),
                userModel.getLastName(),
                userModel.getNumber()
        )).collect(Collectors.toList());
    }

    @Override
    public UserDto saveUser(UserDto userDto) {
        UserModel userModel = new UserModel(
                userDto.getUuid(),
                userDto.getName(),
                userDto.getLastName(),
                userDto.getNumber()
        );
        UserModel savedUser = userRepository.save(userModel);
        return new UserDto(
                savedUser.getId(),
                savedUser.getName(),
                savedUser.getLastName(),
                savedUser.getNumber()
        );
    }

    @Override
    public UserDto updateById(UserDto request, UUID uuid) {
        UserModel userModel = userRepository.findById(uuid).orElseThrow(() -> new RuntimeException("User not found"));
        userModel.setName(request.getName());
        userModel.setLastName(request.getLastName());
        userModel.setNumber(request.getNumber());
        UserModel updatedUser = userRepository.save(userModel);
        return new UserDto(
                updatedUser.getId(),
                updatedUser.getName(),
                updatedUser.getLastName(),
                updatedUser.getNumber()
        );
    }

    @Override
    public boolean deleteById(UUID uuid) {
        try {
            userRepository.deleteById(uuid);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
