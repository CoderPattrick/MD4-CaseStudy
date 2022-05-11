package com.example.md4casestudy.repo;

import com.example.md4casestudy.model.salary.PlayerSalary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerSalaryRepo extends JpaRepository<PlayerSalary,Long> {
}
