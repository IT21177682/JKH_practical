package com.example.POS.UserService;

import com.example.POS.UserEntity.User;
import com.example.POS.UserRepository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public Long registerUser(String username, String password) {
        return userRepository.registerUser(username, password);
    }

    public boolean loginUser(String username, String password) {
        Integer loginStatus = userRepository.loginUser(username, password);
        return loginStatus != null && loginStatus == 1;
    }
}

