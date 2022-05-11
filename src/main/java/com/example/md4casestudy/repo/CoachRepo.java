package com.example.md4casestudy.repo;

import com.example.md4casestudy.model.Coach;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoachRepo extends JpaRepository<Coach,Long> {
}
