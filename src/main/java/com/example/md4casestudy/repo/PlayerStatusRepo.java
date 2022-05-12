package com.example.md4casestudy.repo;

import com.example.md4casestudy.model.PlayerStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerStatusRepo extends JpaRepository<PlayerStatus, Long> {
}
