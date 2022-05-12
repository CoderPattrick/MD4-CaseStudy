package com.example.md4casestudy.service;

import com.example.md4casestudy.model.DTO.WeeklySalaryOfAllCoach;
import com.example.md4casestudy.model.DTO.WeeklySalaryOfAllPlayer;
import com.example.md4casestudy.model.salary.Week;

public interface WeekService extends GeneralService<Week>{
    Iterable<WeeklySalaryOfAllCoach> getWeeklySalaryOfAllCoach(Long id);
    Iterable<WeeklySalaryOfAllPlayer> getWeeklySalaryOfAllPlayer(Long id);

}
