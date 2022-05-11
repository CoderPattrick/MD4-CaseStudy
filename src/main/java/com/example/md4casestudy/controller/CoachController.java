package com.example.md4casestudy.controller;

import com.example.md4casestudy.model.Coach;
import com.example.md4casestudy.service.CoachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin("*")
@RequestMapping("/coach")
public class CoachController implements GeneralController<Coach>{
    @Autowired
    private CoachService coachService;

    @GetMapping
    @Override
    public ResponseEntity<Iterable<Coach>> findAll() {
        return new ResponseEntity<>(coachService.findAll(), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    @Override
    public ResponseEntity<Coach> findById(@PathVariable Long id) {
        return new ResponseEntity<>(coachService.findById(id).get(), HttpStatus.OK);
    }

    @Override
    @PostMapping
    public ResponseEntity save(@ModelAttribute Coach coach) {
        coachService.save(coach);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @Override
    @PostMapping("/{id}")
    public ResponseEntity save(@PathVariable Long id,@ModelAttribute Coach coach) {
        coach.setId(id);
        coachService.save(coach);
        return new ResponseEntity<>(HttpStatus.OK);
        //cần chỉnh sửa để upload file
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity deleteById(@PathVariable Long id) {
        coachService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
