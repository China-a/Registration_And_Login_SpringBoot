package com.example.registration_and_login_springboot.Service;

import com.example.registration_and_login_springboot.Model.User;
import com.example.registration_and_login_springboot.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;


public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}
