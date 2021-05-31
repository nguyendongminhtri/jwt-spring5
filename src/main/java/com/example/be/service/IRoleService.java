package com.example.be.service;

import com.example.be.model.Role;
import com.example.be.model.RoleName;

import java.util.Optional;

public interface IRoleService {
    Optional<Role> findByName(RoleName name);
}
