package com.example.md4casestudy.controller;

import com.example.md4casestudy.model.Position;
import com.example.md4casestudy.service.PositionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/position")
@CrossOrigin("*")
public class PositionController {

    @Autowired
    private PositionServiceImpl positionService;
    @GetMapping
    public ResponseEntity<Iterable<Position>> getAllPosition() {
        return new ResponseEntity<>(positionService.getAll(), HttpStatus.OK);
    }
}
