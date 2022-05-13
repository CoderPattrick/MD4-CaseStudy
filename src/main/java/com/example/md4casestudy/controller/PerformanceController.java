package com.example.md4casestudy.controller;

import com.example.md4casestudy.model.Nationality;
import com.example.md4casestudy.model.Performance;
import com.example.md4casestudy.service.NationalityServiceImpl;
import com.example.md4casestudy.service.PerformanceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/performance")
@CrossOrigin("*")
public class PerformanceController {

    @Autowired
    private PerformanceServiceImpl performanceService;

    @GetMapping()
    public ResponseEntity<Iterable<Performance>> getAllPerformance() {
        Iterable<Performance> performances = performanceService.findAll();
        return new ResponseEntity<>(performances, HttpStatus.OK);
    }
}
