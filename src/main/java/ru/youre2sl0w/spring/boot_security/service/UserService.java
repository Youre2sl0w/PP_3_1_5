package ru.youre2sl0w.spring.boot_security.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import ru.youre2sl0w.spring.boot_security.entity.User;

import java.util.List;

public interface UserService extends UserDetailsService {
    User findByUsername(String username);

    User saveUser(User user);

    void deleteById(Long id);

    List<User> findAll();

    User findById(Long id);
}