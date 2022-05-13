package com.example.md4casestudy.controller;

import com.example.md4casestudy.model.DTO.SearchPlayer;
import com.example.md4casestudy.model.Player;
import com.example.md4casestudy.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin("*")
@RequestMapping("/player")
public class PlayerController implements GeneralController<Player>{
    @Autowired
    private PlayerService playerService;

    @Override
    @GetMapping
    public ResponseEntity<Iterable<Player>> findAll() {
        return new ResponseEntity<>(playerService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    @Override
    public ResponseEntity<Player> findById(@PathVariable Long id) {
        return new ResponseEntity<>(playerService.findById(id).get(), HttpStatus.OK);
    }

    @PostMapping
    @Override
    public ResponseEntity save(@ModelAttribute Player player) {
        playerService.save(player);
        return new ResponseEntity<>(HttpStatus.CREATED);    }

    @PostMapping("/{id}")
    @Override
    public ResponseEntity save(@PathVariable Long id,@ModelAttribute Player player) {
        player.setId(id);
        playerService.save(player);
        return new ResponseEntity<>(HttpStatus.OK);
        //cần chỉnh sửa để upload file
    }

    @DeleteMapping("/{id}")
    @Override
    public ResponseEntity deleteById(@PathVariable Long id) {
        playerService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);    }

    @GetMapping("/position/{id}")
    public ResponseEntity<Iterable<SearchPlayer>> findByPosition(@PathVariable Long id){
        Iterable<SearchPlayer> list = playerService.findByPosition(id);
        return new ResponseEntity<>(list,HttpStatus.OK);    }

    @GetMapping("/status/{id}")
    public ResponseEntity<Iterable<SearchPlayer>> findByStatus(@PathVariable Long id){
        Iterable<SearchPlayer> list = playerService.findByStatus(id);
        return new ResponseEntity<>(list,HttpStatus.OK);    }

}
