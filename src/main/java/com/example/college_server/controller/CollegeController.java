package com.example.college_server.controller;

import com.example.college_server.model.College;
import com.example.college_server.repository.CollegeRepository;
import com.example.college_server.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/colleges")
public class CollegeController {

    @Autowired
    private CollegeRepository collegeRepository;

    @PostMapping
    public College save(@RequestBody College college) {
        return collegeRepository.save(college);
    }

    @GetMapping
    public List<College> findAll() {
        return collegeRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<College> findById(@PathVariable Long id) {
        return collegeRepository.findById(id)
                .map(college -> ResponseEntity.ok(college))
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        if (collegeRepository.existsById(id)) {
            collegeRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}