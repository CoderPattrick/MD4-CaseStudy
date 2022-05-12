package com.example.md4casestudy.controller;

import com.example.md4casestudy.model.Player;
import com.example.md4casestudy.model.PlayerForm;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


public interface GeneralController<T> {
    ResponseEntity<Iterable<T>> findAll();
    ResponseEntity<T> findById(Long id);
    ResponseEntity save( T t);
    ResponseEntity save(Long id, T t);
    ResponseEntity deleteById( Long id);

}
