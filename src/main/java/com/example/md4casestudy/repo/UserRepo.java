package com.example.md4casestudy.repo;

import com.example.md4casestudy.model.user.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<AppUser,Long> {
}
