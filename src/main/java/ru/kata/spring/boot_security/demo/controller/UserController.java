package ru.kata.spring.boot_security.demo.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.kata.spring.boot_security.demo.model.User;


@Controller
public class UserController {

    @GetMapping("/user")
    public String showUserData(Model model, Authentication authentication) {
        User user = (User) authentication.getPrincipal();
        model.addAttribute("user",user);
        return "user_info";
    }
}

