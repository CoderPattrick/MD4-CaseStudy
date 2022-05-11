package com.example.md4casestudy.repo;

import com.example.md4casestudy.model.salary.CoachSalary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoachSalaryRepo extends JpaRepository<CoachSalary,Long> {
}
