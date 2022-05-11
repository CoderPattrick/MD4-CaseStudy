package com.example.md4casestudy.service;

import com.example.md4casestudy.model.salary.CoachSalary;
import com.example.md4casestudy.repo.CoachSalaryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CoachSalaryServiceImpl implements CoachSalaryService{
    @Autowired
    private CoachSalaryRepo coachSalaryRepo;

    @Override
    public Iterable<CoachSalary> findAll() {
        return coachSalaryRepo.findAll();
    }

    @Override
    public Optional<CoachSalary> findById(Long id) {
        return coachSalaryRepo.findById(id);
    }

    @Override
    public void save(CoachSalary coachSalary) {
        coachSalaryRepo.save(coachSalary);
    }

    @Override
    public void deleteById(Long id) {
        coachSalaryRepo.deleteById(id);
    }
}
