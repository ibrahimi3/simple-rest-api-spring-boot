package com.ibrahim.crud.service.impl;

import lombok.AllArgsConstructor;
import com.ibrahim.crud.entity.Mentor;
import com.ibrahim.crud.repository.MentorRepository;
import com.ibrahim.crud.service.MentorService;
import org.apache.logging.log4j.util.Strings;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
@Service
@AllArgsConstructor
public class MentorServiceImpl implements MentorService {

    private MentorRepository mentorRepository;

    @Override
    public Mentor createMentor(Mentor mentor) {
        return mentorRepository.save(mentor);
    }

    @Override
    public Mentor getMentorById(Long mentorId) {
        Optional<Mentor> optionalMentor = mentorRepository.findById(mentorId);
        return optionalMentor.get();
    }

    @Override
    public List<Mentor> getAllMentors() {
        return mentorRepository.findAll();
    }

    @Override
    public Mentor updateMentor(Mentor mentor) {
        Mentor existingMentor = mentorRepository.findById(mentor.getId()).get();
        existingMentor.setFirstName(mentor.getFirstName());
        existingMentor.setLastName(mentor.getLastName());
        existingMentor.setEmail(mentor.getEmail());
        Mentor updatedMentor = mentorRepository.save(existingMentor);
        return updatedMentor;
    }

    @Override
    public void deleteMentor(Long mentorId) {
        mentorRepository.deleteById(mentorId);
    }

}
