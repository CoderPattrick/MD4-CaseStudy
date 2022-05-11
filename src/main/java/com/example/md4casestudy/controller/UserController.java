package com.example.md4casestudy.controller;

import com.example.md4casestudy.model.user.AppUser;
import com.example.md4casestudy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin("*")
@RequestMapping("/user")
public class UserController implements GeneralController<AppUser>{
    @Autowired
    private UserService userService;

    @Override
    @GetMapping
    public ResponseEntity<Iterable<AppUser>> findAll() {
        return new ResponseEntity<>(userService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    @Override
    public ResponseEntity<AppUser> findById(@PathVariable Long id) {
        return new ResponseEntity<>(userService.findById(id).get(), HttpStatus.OK);
    }

    @PostMapping
    @Override
    public ResponseEntity save(@ModelAttribute AppUser user) {
        userService.save(user);
        return new ResponseEntity<>(HttpStatus.CREATED);    }

    @PostMapping("/{id}")
    @Override
    public ResponseEntity save(@PathVariable Long id,@RequestBody AppUser user) {
        user.setId(id);
        userService.save(user);
        return new ResponseEntity<>(HttpStatus.OK);
        //cần chỉnh sửa để upload file
    }

    @DeleteMapping("/{id}")
    @Override
    public ResponseEntity deleteById(@PathVariable Long id) {
        userService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);    }
}
