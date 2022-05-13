package com.example.md4casestudy.service;

import com.example.md4casestudy.model.coach.Coach;
import com.example.md4casestudy.repo.CoachRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CoachServiceImpl implements CoachService{
    @Autowired
    private CoachRepo coachRepo;
    @Override
    public Iterable<Coach> findAll() {
        return coachRepo.findAll();
    }

    @Override
    public Optional<Coach> findById(Long id) {
        return coachRepo.findById(id);
    }

    @Override
    public void save(Coach coach) {
        coachRepo.save(coach);
    }

    @Override
    public void deleteById(Long id) {
        coachRepo.deleteById(id);
    }
}
