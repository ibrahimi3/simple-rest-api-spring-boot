package com.ibrahim.crud.controller;

import lombok.AllArgsConstructor;
import com.ibrahim.crud.entity.Mentor;
import com.ibrahim.crud.service.MentorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@AllArgsConstructor
@RequestMapping("api/mentors")
public class MentorController {

    private MentorService mentorService;


    // build create Mentor REST API
    // http://localhost:8080/api/mentors/
    @PostMapping
    public ResponseEntity<Mentor> createMentor(@RequestBody Mentor mentor){
        Mentor savedMentor = mentorService.createMentor(mentor);
        return new ResponseEntity<>(savedMentor, HttpStatus.CREATED);
    }

    // Build get Mentor by id REST API
    // http://localhost:8080/api/mentors/1
    @GetMapping("{id}")
    public ResponseEntity<Mentor> getMentorById(@PathVariable("id") Long mentorId){
        Mentor mentor = mentorService.getMentorById(mentorId);
        return new ResponseEntity<>(mentor, HttpStatus.OK);
    }

    // Build Get All Mentor REST API
    // http://localhost:8080/api/mentors
    @GetMapping
    public ResponseEntity<List<Mentor>> getAllMentor(){
        List<Mentor> mentors = mentorService.getAllMentors();
        return new ResponseEntity<>(mentors, HttpStatus.OK);
    }

    // Build Update Mentor REST API
    @PutMapping("{id}")
    // http://localhost:8080/api/mentors/1
    public ResponseEntity<Mentor> updateMentor(@PathVariable("id") Long mentorId,
                                           @RequestBody Mentor mentor){
        mentor.setId(mentorId);
        Mentor updatedMentor = mentorService.updateMentor(mentor);
        return new ResponseEntity<>(updatedMentor, HttpStatus.OK);
    }

    // Build Delete Mentor REST API
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteMentor(@PathVariable("id") Long mentorId){
        mentorService.deleteMentor(mentorId);
        return new ResponseEntity<>("Mentor successfully deleted!", HttpStatus.OK);
    }

}
