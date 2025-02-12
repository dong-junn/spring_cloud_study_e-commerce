package com.msa.ecommerce.userservice.service;

import com.msa.ecommerce.userservice.dto.UserDto;
import com.msa.ecommerce.userservice.jpa.UserEntity;

public interface UserService {

    UserDto createUser(UserDto userDto);
    UserDto getUserByUserId(String userId);
    Iterable<UserEntity> getUserByAll();
}
