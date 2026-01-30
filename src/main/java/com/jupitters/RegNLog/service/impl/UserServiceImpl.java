package com.jupitters.RegNLog.service.impl;

import com.jupitters.RegNLog.dto.UserRegistertDto;
import com.jupitters.RegNLog.model.Role;
import com.jupitters.RegNLog.model.User;
import com.jupitters.RegNLog.repository.UserRepository;
import com.jupitters.RegNLog.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
@RequiredArgsConstructor
public class UserServiceImpl  implements UserService {
    private final UserRepository userRepository;

    @Override
    public User register(UserRegistertDto request) {
        User user = new User();
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getFirstName());
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());
        user.setRole(Arrays.asList(new Role("USER")));
    }
}
