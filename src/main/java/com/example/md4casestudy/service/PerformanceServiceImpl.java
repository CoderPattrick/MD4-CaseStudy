package com.example.md4casestudy.service;

import com.example.md4casestudy.model.Nationality;
import com.example.md4casestudy.model.Performance;
import com.example.md4casestudy.repo.NationalityRepo;
import com.example.md4casestudy.repo.PerformanceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PerformanceServiceImpl implements PerformanceService{

    @Autowired
    private PerformanceRepo performanceRepo;

    public Iterable<Performance> findAll() {
        return performanceRepo.findAll();
    }
}
