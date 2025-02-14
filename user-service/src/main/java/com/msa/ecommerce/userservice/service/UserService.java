package com.msa.ecommerce.userservice.service;

import com.msa.ecommerce.userservice.dto.UserDto;
import com.msa.ecommerce.userservice.jpa.UserEntity;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    UserDto createUser(UserDto userDto);
    UserDto getUserByUserId(String userId);
    UserDto getUserDetailsByEmail(String userName);
    Iterable<UserEntity> getUserByAll();
}
