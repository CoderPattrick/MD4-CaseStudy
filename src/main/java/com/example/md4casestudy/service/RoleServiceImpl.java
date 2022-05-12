package com.example.md4casestudy.service;

import com.example.md4casestudy.model.user.AppRole;
import com.example.md4casestudy.repo.RoleRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleRepo roleRepo;

    @Override
    public Iterable<AppRole> findAll() {
        return roleRepo.findAll();
    }

    @Override
    public Optional<AppRole> findById(Long id) {
        return roleRepo.findById(id);
    }

    @Override
    public void save(AppRole appRole) {
        roleRepo.save(appRole);
    }

    @Override
    public void deleteById(Long id) {
        roleRepo.deleteById(id);
    }

    @Override
    public AppRole findByName(String name) {
        return roleRepo.findByName(name);
    }
}

