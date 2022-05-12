package com.example.md4casestudy.service;

import com.example.md4casestudy.model.Player;
import com.example.md4casestudy.repo.PlayerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PlayerServiceImpl implements PlayerService{
    @Autowired
    private PlayerRepo playerRepo;

    @Override
    public Iterable<Player> findAll() {
        return playerRepo.findAll();
    }

    @Override
    public Optional<Player> findById(Long id) {
        return playerRepo.findById(id);
    }

    @Override
    public void save(Player player) {
        playerRepo.save(player);
    }

    @Override
    public void deleteById(Long id) {
        playerRepo.deleteById(id);
    }

}
