package com.example.md4casestudy.service;

import com.example.md4casestudy.model.DTO.SearchPlayer;
import com.example.md4casestudy.model.player.Player;

import java.util.Optional;

public interface PlayerService extends GeneralService<Player>{
    Optional<Player> findByUserId(Long user_id);

    Iterable<SearchPlayer> findByPosition(Long position_id);
    Iterable<SearchPlayer> findByStatus(Long status_id);
}
