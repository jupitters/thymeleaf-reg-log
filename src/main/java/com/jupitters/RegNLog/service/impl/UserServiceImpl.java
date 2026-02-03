package com.jupitters.RegNLog.service.impl;

import com.jupitters.RegNLog.dto.UserRegisterDto;
import com.jupitters.RegNLog.model.Role;
import com.jupitters.RegNLog.model.User;
import com.jupitters.RegNLog.repository.UserRepository;
import com.jupitters.RegNLog.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
@RequiredArgsConstructor
public class UserServiceImpl  implements UserService {
    private final UserRepository userRepository;

    @Override
    public User register(UserRegisterDto request) {
        User user = new User();
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getFirstName());
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());
        user.setRole(Arrays.asList(new Role("USER")));

        return userRepository.save(user);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(username);
    }
}
