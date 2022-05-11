package com.example.md4casestudy.repo;

import com.example.md4casestudy.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepo extends JpaRepository<Player,Long> {
}
