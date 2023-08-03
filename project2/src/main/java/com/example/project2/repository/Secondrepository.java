package com.example.project2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project2.model.Second;

public interface Secondrepository extends JpaRepository<Second, Long> {
    
} 