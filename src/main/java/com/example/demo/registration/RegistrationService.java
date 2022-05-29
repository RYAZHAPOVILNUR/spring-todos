package com.example.demo.registration;

import com.example.demo.user.User;
import com.example.demo.user.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RegistrationService {
    UserService userService;

    public User register(RegistrationRequest request) {
        // validate email

        return userService.signUpUser(
            new User(
                request.firstName(),
                request.lastName(),
                request.email(),
                request.password()
            )
        );
    }
}
