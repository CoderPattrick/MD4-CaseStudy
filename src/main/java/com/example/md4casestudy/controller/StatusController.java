package com.example.md4casestudy.controller;

import com.example.md4casestudy.model.PlayerStatus;
import com.example.md4casestudy.model.Position;
import com.example.md4casestudy.service.PositionServiceImpl;
import com.example.md4casestudy.service.StatusServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/status")
@CrossOrigin("*")
public class StatusController {

    @Autowired
    private StatusServiceImpl statusService;
    @GetMapping
    public ResponseEntity<Iterable<PlayerStatus>> getAllStatus() {
        return new ResponseEntity<>(statusService.getAll(), HttpStatus.OK);
    }
}
