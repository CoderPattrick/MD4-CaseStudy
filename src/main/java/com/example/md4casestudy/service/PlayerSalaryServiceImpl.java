package com.example.md4casestudy.service;

import com.example.md4casestudy.model.salary.PlayerSalary;
import com.example.md4casestudy.repo.PlayerSalaryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PlayerSalaryServiceImpl implements PlayerSalaryService{
    @Autowired
    private PlayerSalaryRepo playerSalaryRepo;

    @Override
    public Iterable<PlayerSalary> findAll() {
        return playerSalaryRepo.findAll();
    }

    @Override
    public Optional<PlayerSalary> findById(Long id) {
        return playerSalaryRepo.findById(id);
    }

    @Override
    public void save(PlayerSalary playerSalary) {
        playerSalaryRepo.save(playerSalary);
    }

    @Override
    public void deleteById(Long id) {
        playerSalaryRepo.deleteById(id);
    }
}
