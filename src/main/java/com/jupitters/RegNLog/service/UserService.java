package com.jupitters.RegNLog.service;

import com.jupitters.RegNLog.dto.UserRegisterDto;
import com.jupitters.RegNLog.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User register(UserRegisterDto user);
}
