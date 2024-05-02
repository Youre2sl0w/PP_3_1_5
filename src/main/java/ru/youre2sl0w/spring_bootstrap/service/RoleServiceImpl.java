package ru.youre2sl0w.spring_bootstrap.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.youre2sl0w.spring_bootstrap.entity.Role;
import ru.youre2sl0w.spring_bootstrap.repository.RoleRepository;

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