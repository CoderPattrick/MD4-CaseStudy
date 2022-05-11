package com.example.md4casestudy.repo;

import com.example.md4casestudy.model.Nationality;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NationRepo extends JpaRepository<Nationality,Long> {
}
