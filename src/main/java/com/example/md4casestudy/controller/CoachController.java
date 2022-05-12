package com.example.md4casestudy.controller;

import com.example.md4casestudy.model.Coach;
import com.example.md4casestudy.model.CoachForm;
import com.example.md4casestudy.model.Player;
import com.example.md4casestudy.service.CoachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.IOException;

@Controller
@CrossOrigin("*")
@RequestMapping("/coach")
public class CoachController {
    @Autowired
    private CoachService coachService;

    @Value("${upload.path}")
    String uploadPath;


    @GetMapping

    public ResponseEntity<Iterable<Coach>> findAll() {
        return new ResponseEntity<>(coachService.findAll(), HttpStatus.OK);
    }
    @GetMapping("/{id}")

    public ResponseEntity<Coach> findById(@PathVariable Long id) {
        return new ResponseEntity<>(coachService.findById(id).get(), HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<Coach> addNewPlayer(@ModelAttribute CoachForm coachForm) {

        String fileNameCV = coachForm.getCv().getOriginalFilename();
        try {
            FileCopyUtils.copy(coachForm.getCv().getBytes(), new File(uploadPath + fileNameCV));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Coach coach = new Coach(coachForm.getName(), coachForm.getDoB(), coachForm.getNationality(), coachForm.getBase_salary(), fileNameCV);
        coachService.save(coach);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }


//    @PostMapping
//    public ResponseEntity save(@ModelAttribute Coach coach) {
//        coachService.save(coach);
//        return new ResponseEntity<>(HttpStatus.CREATED);
//    }


    @PostMapping("/{id}")
    public ResponseEntity save(@PathVariable Long id,@ModelAttribute Coach coach) {
        coach.setId(id);
        coachService.save(coach);
        return new ResponseEntity<>(HttpStatus.OK);
        //cần chỉnh sửa để upload file
    }


    @DeleteMapping("/{id}")
    public ResponseEntity deleteById(@PathVariable Long id) {
        coachService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
