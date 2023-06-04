package com.ibrahim.crud.service;

import com.ibrahim.crud.entity.Mentor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MentorService {

    Mentor createMentor(Mentor mentor);

    Mentor getMentorById(Long mentorId);

    List<Mentor> getAllMentors();

    Mentor updateMentor(Mentor mentor);

    void deleteMentor(Long mentorId);

}
