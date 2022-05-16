package com.example.md4casestudy.service;

import com.example.md4casestudy.model.DTO.SearchPlayer;
import com.example.md4casestudy.model.player.Player;
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

    @Override
    public Iterable<SearchPlayer> findByPosition(Long position_id) {
        return playerRepo.findByPosition(position_id);
    }

    @Override
    public Iterable<SearchPlayer> findByStatus(Long status_id) {
        return playerRepo.findByStatus(status_id);
    }

    @Override
    public Iterable<SearchPlayer> findByName(String name) {
        return playerRepo.findByName(name);
    }

    @Override
    public Iterable<SearchPlayer> findByBase_salary(Long min, Long max) {
        return playerRepo.findByBase_salary(min,max);
    }

    @Override
    public Optional<Player> findByUserId(Long user_id) {
        return playerRepo.findByUserId(user_id);
    }
}
