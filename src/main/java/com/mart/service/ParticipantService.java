package com.mart.service;

import com.mart.dao.ParticipantRepo;
import com.mart.domain.Participant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParticipantService {
    @Autowired
    ParticipantRepo participantRepo;

    public List<Participant> findAllParticipant(){
        return participantRepo.findAllParticipant();
    }

    public Participant findOne(int id){
        return participantRepo.findOne( id);
    }
    public  void save(Participant participant){
        participantRepo.save(participant);
    }
    public  void delete(int id){
        participantRepo.delete(id);
    }
}
