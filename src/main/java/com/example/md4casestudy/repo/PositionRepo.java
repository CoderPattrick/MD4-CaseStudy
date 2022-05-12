package com.example.md4casestudy.repo;

import com.example.md4casestudy.model.Position;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PositionRepo extends JpaRepository<Position, Long> {
}
