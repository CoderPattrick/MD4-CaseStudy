package com.example.md4casestudy.service;

import com.example.md4casestudy.model.PlayerStatus;
import com.example.md4casestudy.model.Position;
import com.example.md4casestudy.repo.PositionRepo;
import com.example.md4casestudy.repo.StatusRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StatusServiceImpl implements StatusService{
    @Autowired
    private StatusRepo statusRepo;

    public Iterable<PlayerStatus> getAll() {
        return statusRepo.findAll();
    }
}
