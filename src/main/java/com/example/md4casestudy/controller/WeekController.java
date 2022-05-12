package com.example.md4casestudy.controller;

import com.example.md4casestudy.model.DTO.WeeklySalaryOfAllCoach;
import com.example.md4casestudy.model.salary.Week;
import com.example.md4casestudy.service.WeekService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin("*")
@RequestMapping("/week")
public class WeekController implements GeneralController<Week> {
    @Autowired
    private WeekService weekService;

    @GetMapping
    @Override
    public ResponseEntity<Iterable<Week>> findAll() {
        return new ResponseEntity<>(weekService.findAll(), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    @Override
    public ResponseEntity<Week> findById(@PathVariable Long id) {
        return new ResponseEntity<>(weekService.findById(id).get(), HttpStatus.OK);
    }

    @Override
    @PostMapping
    public ResponseEntity save(@RequestBody Week week) {
        weekService.save(week);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @Override
    @PostMapping("/{id}")
    public ResponseEntity save(@PathVariable Long id,@RequestBody Week week) {
        week.setId(id);
        weekService.save(week);
        return new ResponseEntity<>(HttpStatus.OK);
        //cần chỉnh sửa để upload file
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity deleteById(@PathVariable Long id) {
        weekService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/{id}/coach_salary")
    public ResponseEntity<Iterable<WeeklySalaryOfAllCoach>> getWSOAC(@PathVariable Long id){
        Iterable<WeeklySalaryOfAllCoach> list = weekService.getWeeklySalaryOfAllCoach(id);
        return new ResponseEntity<>(list,HttpStatus.OK);
    }
}
