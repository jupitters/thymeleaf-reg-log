package com.jupitters.RegNLog.service;

import com.jupitters.RegNLog.dto.UserRegistertDto;
import com.jupitters.RegNLog.model.User;

public interface UserService {
    User register(UserRegistertDto user);
}
