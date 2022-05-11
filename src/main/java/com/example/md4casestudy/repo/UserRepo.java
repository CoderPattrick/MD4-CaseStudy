package com.example.md4casestudy.repo;

import com.example.md4casestudy.model.user.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<AppUser,Long> {
}
