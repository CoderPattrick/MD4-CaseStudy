package com.example.md4casestudy.service;

import com.example.md4casestudy.model.user.AppUser;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Optional;

public interface UserService extends GeneralService<AppUser>, UserDetailsService {
    AppUser findByUsername(String username);
}
