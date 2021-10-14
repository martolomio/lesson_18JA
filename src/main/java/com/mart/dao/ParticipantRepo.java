package com.mart.dao;

import com.mart.domain.Participant;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Repository
public class ParticipantRepo {

    private List<Participant> participants = new ArrayList<>();
    @PostConstruct
    public void  init(){
        Participant prac1 = new Participant();
        prac1.setName("Tom");
        prac1.setEmail("tommy@mail.com");
        prac1.setLevel(3);
        prac1.setPrimarySkill("normal");

        Participant prac2 = new Participant();
        prac2.setName("Elin");
        prac2.setEmail("elined@mail.com");
        prac2.setLevel(5);
        prac2.setPrimarySkill("amazing");

        participants.add(prac1);
        participants.add(prac2);
    }

    public  List<Participant> findAllParticipant(){
        return  participants;
    }

    public  Participant findOne(int id){
        return participants.stream().filter(participant -> participant.getId()==id).findFirst().orElse(null);

    }

    public void save(Participant participant){
        Participant participantToUpdate = null;

        if(participant.getId() != null){
            participantToUpdate = findOne(participant.getId());
            int participantIndex = participants.indexOf(participantToUpdate);
            participantToUpdate.setName(participant.getName());
            participantToUpdate.setEmail(participant.getEmail());
            participantToUpdate.setLevel(participant.getLevel());
            participantToUpdate.setPrimarySkill(participant.getPrimarySkill());
            participants.set(participantIndex,participantToUpdate);
        }else {
            participant.setId(participants.size()+1);
            participants.add(participant);
        }
    }

    public  void  delete(int id){
        Iterator<Participant> iter = participants.iterator();
        while (iter.hasNext()){
            if (iter.next().getId() == id){
                iter.remove();
            }
        }
    }
}
