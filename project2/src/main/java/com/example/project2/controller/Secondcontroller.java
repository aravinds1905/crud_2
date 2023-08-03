package com.example.project2.controller;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.project2.model.Second;
import com.example.project2.repository.Secondrepository;

public class Secondcontroller {
    Secondrepository secondrepository;
    
    @GetMapping("/show_user/{id}")
    public ResponseEntity<Second> getUserById(@PathVariable("id") Long id) {

        
        Optional<Second> second2 = secondrepository.findById(id);

        if (second2.isPresent()) {
            Second second3 = second2.get();
            return new ResponseEntity<Second>(second3, HttpStatus.OK);
        }

        else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/delete_user/{id}")
    public ResponseEntity<HttpStatus> deleteUser(@PathVariable("id") Long id) {
        secondrepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
} 