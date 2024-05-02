package ru.youre2sl0w.spring_bootstrap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/admin")
    public String showAdminPage() {
        return "admin";
    }

    @GetMapping("/user")
    public String userInfo() {
        return "user";
    }

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    @GetMapping("/")
    public String indexPage() {
        return "redirect:/login";
    }
}