package com.example.md4casestudy.controller;

import com.example.md4casestudy.model.player.Player;
import com.example.md4casestudy.model.player.PlayerForm;
import com.example.md4casestudy.service.PlayerService;
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
@RequestMapping("/player")
public class PlayerController implements GeneralController<Player> {
    @Autowired
    private PlayerService playerService;

    @Value("${file-upload}")
    String uploadPath;


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

    @Override
    public ResponseEntity save(Player player) {
        return null;
    }

    @PostMapping
    public ResponseEntity<Player> addNewPlayer(@ModelAttribute PlayerForm playerForm) {

        String fileNameCV = playerForm.getCv().getOriginalFilename();
        try {
            FileCopyUtils.copy(playerForm.getCv().getBytes(), new File(uploadPath + fileNameCV));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String fileNameAvatar = playerForm.getAvatar().getOriginalFilename();
        try {
            FileCopyUtils.copy(playerForm.getAvatar().getBytes(), new File(uploadPath + fileNameAvatar));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Player player = new Player(playerForm.getName(), playerForm.getPosition(), playerForm.getDoB(),
                playerForm.getNationality(), playerForm.getPerformance(), playerForm.getStatus(), playerForm.getBase_salary(), playerForm.getHeight(), playerForm.getWeight(), fileNameCV, fileNameAvatar);
                playerService.save(player);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }


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
}
