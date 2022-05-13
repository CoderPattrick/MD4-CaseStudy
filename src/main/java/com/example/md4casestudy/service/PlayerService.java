package com.example.md4casestudy.service;

import com.example.md4casestudy.model.DTO.SearchPlayer;
import com.example.md4casestudy.model.player.Player;

public interface PlayerService extends GeneralService<Player>{
    Iterable<SearchPlayer> findByPosition(Long position_id);
    Iterable<SearchPlayer> findByStatus(Long status_id);
    Iterable<SearchPlayer> findByName(String name);
    Iterable<SearchPlayer> findByBase_salary(Long min,Long max);
}
