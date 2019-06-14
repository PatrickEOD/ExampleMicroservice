package com.exampleMicroservice.crazyCucumberAPI.service;

import com.exampleMicroservice.crazyCucumberAPI.repository.CrewRepository;
import com.exampleMicroservice.crazyCucumberAPI.model.Crew;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CrewServiceImpl implements CrewService {

    private final CrewRepository crewRepository;

    @Autowired
    public CrewServiceImpl (CrewRepository crewRepository) {
        this.crewRepository = crewRepository;
    }

    @Override
    public List<Crew> getAll() {
        return crewRepository.findAll();
    }

    // TODO catch error if optional is not present
    @Override
    public Crew getCrewById(String id) {
        Optional<Crew> crew = crewRepository.findCrewById(id);
        return crew.get();
    }


}
