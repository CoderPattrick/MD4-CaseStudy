package com.example.md4casestudy.controller;

import com.example.md4casestudy.model.DTO.SearchPlayer;
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
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Optional;

@Controller
@CrossOrigin("*")
@RequestMapping("/player")
public class PlayerController {
    @Autowired
    private PlayerService playerService;

    @Value("${upload.path}")
    String uploadPath;



    @GetMapping
    public ResponseEntity<Iterable<Player>> findAll() {
        return new ResponseEntity<>(playerService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")

    public ResponseEntity<Player> findById(@PathVariable Long id) {
        return new ResponseEntity<>(playerService.findById(id).get(), HttpStatus.OK);
    }


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
                playerForm.getNationality(), playerForm.getPerformance(), playerForm.getStatus(), playerForm.getBase_salary(),
                playerForm.getHeight(), playerForm.getWeight(), fileNameCV, fileNameAvatar);
                playerService.save(player);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }


//    @PostMapping("/{id}")
//    @Override
//    public ResponseEntity save(@PathVariable Long id,@ModelAttribute Player player) {
//        player.setId(id);
//        playerService.save(player);
//        return new ResponseEntity<>(HttpStatus.OK);
//        //cần chỉnh sửa để upload file
//    }

@PostMapping("/{id}")
public ResponseEntity<Player> save(@PathVariable Long id, @ModelAttribute PlayerForm playerForm) {
    Optional<Player> playerOptional = playerService.findById(id);
    if (!playerOptional.isPresent()) {
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    MultipartFile multipartFileAvatar = playerForm.getAvatar();
    String fileNameAvatar = multipartFileAvatar.getOriginalFilename();
    try {
        FileCopyUtils.copy(multipartFileAvatar.getBytes(), new File(uploadPath + fileNameAvatar));
    } catch (IOException e) {
        e.printStackTrace();
    }
    MultipartFile multipartFileCV = playerForm.getAvatar();
    String fileNameCV = multipartFileCV.getOriginalFilename();
    try {
        FileCopyUtils.copy(multipartFileCV.getBytes(), new File(uploadPath + multipartFileCV));
    } catch (IOException e) {
        e.printStackTrace();
    }
    Player newPlayer = new Player(id, playerForm.getName(), playerForm.getPosition(), playerForm.getDoB(),
            playerForm.getNationality(), playerForm.getPerformance(), playerForm.getStatus(), playerForm.getBase_salary(),
            playerForm.getHeight(), playerForm.getWeight(), fileNameCV, fileNameAvatar );
    if (newPlayer.getAvatar().equals("filename.jpg")) {
        newPlayer.setAvatar(playerOptional.get().getAvatar());
    }
    playerService.save(newPlayer);
    return new ResponseEntity<>(HttpStatus.OK);
}

    @DeleteMapping("/{id}")

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

    @GetMapping("/name")
    public ResponseEntity<Iterable<SearchPlayer>> findByName(@RequestParam String name){
        Iterable<SearchPlayer> list = playerService.findByName('%'+name+'%');
        return new ResponseEntity<>(list,HttpStatus.OK);    }
    @GetMapping("/salary")
    public ResponseEntity<Iterable<SearchPlayer>> findBySalary(@RequestParam Long min,@RequestParam Long max){
        Iterable<SearchPlayer> list = playerService.findByBase_salary(min,max);
        return new ResponseEntity<>(list,HttpStatus.OK);    }
}
