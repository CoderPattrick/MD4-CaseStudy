package com.example.md4casestudy.service;

import com.example.md4casestudy.model.Nationality;
import com.example.md4casestudy.repo.NationalityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NationalityServiceImpl implements NationalityService{

    @Autowired
    private NationalityRepo nationalityRepo;

    public Iterable<Nationality> findAll() {
        return nationalityRepo.findAll();
    }
}
