package com.example.md4casestudy.repo;

import com.example.md4casestudy.model.coach.Coach;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CoachRepo extends JpaRepository<Coach,Long> {
    Optional<Coach> findByUserId(Long user_id);
}
