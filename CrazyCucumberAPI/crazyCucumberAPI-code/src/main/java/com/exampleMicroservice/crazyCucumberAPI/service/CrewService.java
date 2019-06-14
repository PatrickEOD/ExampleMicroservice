package com.exampleMicroservice.crazyCucumberAPI.service;

import com.exampleMicroservice.crazyCucumberAPI.model.Crew;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CrewService {

    List<Crew> getAll();

    Crew getCrewById (String id);
}
