package com.example.md4casestudy.repo;

import com.example.md4casestudy.model.Nationality;
import com.example.md4casestudy.model.PlayerStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusRepo extends JpaRepository<PlayerStatus, Long> {
}
