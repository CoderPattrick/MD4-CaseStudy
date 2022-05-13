package com.example.md4casestudy.service;

import com.example.md4casestudy.model.Position;
import com.example.md4casestudy.repo.PositionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PositionServiceImpl implements PositionService{
    @Autowired
    private PositionRepo positionRepo;

    public Iterable<Position> getAll() {
        return positionRepo.findAll();
    }
}
