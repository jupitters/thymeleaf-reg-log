package com.jupitters.RegNLog.service;

import com.jupitters.RegNLog.dto.UserRegisterDto;
import com.jupitters.RegNLog.model.User;

public interface UserService {
    User register(UserRegisterDto user);
}
