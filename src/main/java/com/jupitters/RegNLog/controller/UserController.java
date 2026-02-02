package com.jupitters.RegNLog.controller;

import com.jupitters.RegNLog.dto.UserRegistertDto;
import com.jupitters.RegNLog.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/registration")
public class UserController {
    private final UserService userService;

    @ModelAttribute("user")
    public UserRegistertDto userRegistertDto(){
        return new UserRegistertDto();
    }

    @GetMapping
    public String showRegistationForm(){
        return "registration";
    }

    @PostMapping
    public String registerUser(@ModelAttribute("user") UserRegistertDto userDto){
        userService.register(userDto);
        return "redirect:/registration?success";
    }
}
