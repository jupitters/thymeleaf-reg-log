package com.jupitters.RegNLog.controller;

import com.jupitters.RegNLog.dto.UserRegistertDto;
import com.jupitters.RegNLog.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    public String registerUser(@ModelAttribute("user") UserRegistertDto userDto){

    }
}
