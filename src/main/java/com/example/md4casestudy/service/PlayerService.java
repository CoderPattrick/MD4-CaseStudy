package com.example.md4casestudy.service;

import com.example.md4casestudy.model.DTO.SearchPlayer;
import com.example.md4casestudy.model.Player;

public interface PlayerService extends GeneralService<Player>{
    Iterable<SearchPlayer> findByPosition(Long position_id);
    Iterable<SearchPlayer> findByStatus(Long status_id);
}
