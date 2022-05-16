package com.example.md4casestudy.service;

import com.example.md4casestudy.model.coach.Coach;

import java.util.Optional;

public interface CoachService extends GeneralService<Coach>{
    Optional<Coach> findByUserId(Long user_id);
}
