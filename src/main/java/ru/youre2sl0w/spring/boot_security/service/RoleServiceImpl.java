package ru.youre2sl0w.spring.boot_security.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.youre2sl0w.spring.boot_security.entity.Role;
import ru.youre2sl0w.spring.boot_security.repository.RoleRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService {
    private final RoleRepository roleRepository;

    @Override
    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }
}