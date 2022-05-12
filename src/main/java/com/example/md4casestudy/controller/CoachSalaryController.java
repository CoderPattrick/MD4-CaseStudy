package com.example.md4casestudy.controller;

import com.example.md4casestudy.model.salary.CoachSalary;
import com.example.md4casestudy.service.CoachSalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin("*")
@RequestMapping("/coach_salary")
public class CoachSalaryController implements GeneralController<CoachSalary> {
    @Autowired
    private CoachSalaryService coachSalaryService;

    @GetMapping
    @Override
    public ResponseEntity<Iterable<CoachSalary>> findAll() {
        return new ResponseEntity<>(coachSalaryService.findAll(), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    @Override
    public ResponseEntity<CoachSalary> findById(@PathVariable Long id) {
        return new ResponseEntity<>(coachSalaryService.findById(id).get(), HttpStatus.OK);
    }

    @Override
    @PostMapping
    public ResponseEntity save(@RequestBody CoachSalary coachSalary) {
        coachSalaryService.save(coachSalary);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @Override
    @PostMapping("/{id}")
    public ResponseEntity save(@PathVariable Long id,@RequestBody CoachSalary coachSalary) {
        coachSalary.setId(id);
        coachSalaryService.save(coachSalary);
        return new ResponseEntity<>(HttpStatus.OK);
        //cần chỉnh sửa để upload file
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity deleteById(@PathVariable Long id) {
        coachSalaryService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
