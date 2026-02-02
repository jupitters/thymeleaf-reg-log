package com.jupitters.RegNLog.controller;

import com.jupitters.RegNLog.dto.UserRegisterDto;
import com.jupitters.RegNLog.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/registration")
public class UserController {
    private final UserService userService;

    @ModelAttribute("user")
    public UserRegisterDto userRegistertDto(){
        return new UserRegisterDto();
    }

    @GetMapping
    public String showRegistrationForm(){
        return "registration";
    }

    @PostMapping
    public String registerUser(@ModelAttribute("user") UserRegisterDto userDto){
        userService.register(userDto);
        return "redirect:/registration?success";
    }
}
