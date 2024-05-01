package ru.youre2sl0w.spring.boot_security.service;

import ru.youre2sl0w.spring.boot_security.entity.Role;

import java.util.List;

public interface RoleService {
    List<Role> getAllRoles();
}