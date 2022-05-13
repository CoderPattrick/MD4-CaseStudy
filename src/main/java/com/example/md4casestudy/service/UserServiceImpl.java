package com.example.md4casestudy.service;

import com.example.md4casestudy.model.user.AppUser;
import com.example.md4casestudy.model.user.UserPrinciple;
import com.example.md4casestudy.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepo userRepo;

//     private PasswordEncoder passwordEncoder;

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
//        appUser.setPassword(passwordEncoder.encode(appUser.getPassword()));
        userRepo.save(appUser);
    }

    @Override
    public void deleteById(Long id) {
        userRepo.deleteById(id);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<AppUser> userOptional = userRepo.findByUsername(username);
        if (!userOptional.isPresent()){
            throw new UsernameNotFoundException(username);
        }
        return UserPrinciple.build(userOptional.get());
    }

    @Override
    public AppUser findByUsername(String username) {
        return userRepo.findByUsername(username).get();
    }
}
