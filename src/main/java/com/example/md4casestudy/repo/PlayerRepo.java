package com.example.md4casestudy.repo;

import com.example.md4casestudy.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepo extends JpaRepository<Player,Long> {
}
