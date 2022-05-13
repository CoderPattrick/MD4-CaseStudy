package com.example.md4casestudy.controller;

import org.springframework.http.ResponseEntity;


public interface GeneralController<T> {
    ResponseEntity<Iterable<T>> findAll();
    ResponseEntity<T> findById(Long id);
    ResponseEntity save( T t);
    ResponseEntity save(Long id, T t);
    ResponseEntity deleteById( Long id);

}
