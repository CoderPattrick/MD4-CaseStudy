package com.example.md4casestudy.service;

import com.example.md4casestudy.model.DTO.WeeklySalaryOfAllCoach;
import com.example.md4casestudy.model.salary.Week;
import com.example.md4casestudy.repo.WeekRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class WeekServiceImpl implements WeekService {
    @Autowired
    private WeekRepo weekRepo;

    @Override
    public Iterable<Week> findAll() {
        return weekRepo.findAll();
    }

    @Override
    public Optional<Week> findById(Long id) {
        return weekRepo.findById(id);
    }

    @Override
    public void save(Week week) {
        weekRepo.save(week);
    }

    @Override
    public void deleteById(Long id) {
        weekRepo.deleteById(id);
    }

    @Override
    public Iterable<WeeklySalaryOfAllCoach> getWeeklySalaryOfAllCoach(Long id) {
        return weekRepo.getWeeklySalaryOfAllCoach(id);
    }
}
