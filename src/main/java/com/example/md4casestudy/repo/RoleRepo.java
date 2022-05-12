package com.example.md4casestudy.repo;

import com.example.md4casestudy.model.user.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepo extends JpaRepository<AppRole, Long> {
    AppRole findByName(String name);
}
