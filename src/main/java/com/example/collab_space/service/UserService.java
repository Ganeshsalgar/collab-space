package com.example.collab_space.service;

import com.example.collab_space.model.User;
import com.example.collab_space.repositary.UserRepository;
import com.example.collab_space.requestDto.UserRegistrationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;
    public void userRegistration(UserRegistrationDto registrationDto){
        User user = new User();
        user.setActive(false);
        user.setName(registrationDto.getName());
        user.setEmail(registrationDto.getEmail());
        user.setPassword(registrationDto.getPassword());

        userRepository.save(user);
    }
}
