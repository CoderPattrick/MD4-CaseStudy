package com.example.md4casestudy.service;

import com.example.md4casestudy.model.user.AppUser;
import com.example.md4casestudy.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepo userRepo;
    @Override
    public Iterable<AppUser> findAll() {
        return userRepo.findAll();
    }

    @Override
    public Optional<AppUser> findById(Long id) {
        return userRepo.findById(id);
    }

    @Override
    public void save(AppUser appUser) {
        userRepo.save(appUser);
    }

    @Override
    public void deleteById(Long id) {
        userRepo.deleteById(id);
    }
}
