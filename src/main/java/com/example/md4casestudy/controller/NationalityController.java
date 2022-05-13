package com.example.md4casestudy.controller;

import com.example.md4casestudy.model.Nationality;
import com.example.md4casestudy.service.NationalityService;
import com.example.md4casestudy.service.NationalityServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/nationality")
@CrossOrigin("*")
public class NationalityController {

    @Autowired
    private NationalityServiceImpl nationalityService;

    @GetMapping()
    public ResponseEntity<Iterable<Nationality>> getAllNationality() {
        Iterable<Nationality> nationalities = nationalityService.findAll();
        return new ResponseEntity<>(nationalities, HttpStatus.OK);
    }
}
