package com.example.md4casestudy.controller;

import com.example.md4casestudy.model.salary.PlayerSalary;
import com.example.md4casestudy.service.PlayerSalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin("*")
@RequestMapping("/player_salary")
public class PlayerSalaryController implements GeneralController<PlayerSalary> {
    @Autowired
    private PlayerSalaryService playerSalaryService;

    @GetMapping
    @Override
    public ResponseEntity<Iterable<PlayerSalary>> findAll() {
        return new ResponseEntity<>(playerSalaryService.findAll(), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    @Override
    public ResponseEntity<PlayerSalary> findById(@PathVariable Long id) {
        return new ResponseEntity<>(playerSalaryService.findById(id).get(), HttpStatus.OK);
    }

    @Override
    @PostMapping
    public ResponseEntity save(@RequestBody PlayerSalary playerSalary) {
        playerSalaryService.save(playerSalary);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @Override
    @PostMapping("/{id}")
    public ResponseEntity save(@PathVariable Long id,@RequestBody PlayerSalary playerSalary) {
        playerSalary.setId(id);
        playerSalaryService.save(playerSalary);
        return new ResponseEntity<>(HttpStatus.OK);
        //cần chỉnh sửa để upload file
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity deleteById(@PathVariable Long id) {
        playerSalaryService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
