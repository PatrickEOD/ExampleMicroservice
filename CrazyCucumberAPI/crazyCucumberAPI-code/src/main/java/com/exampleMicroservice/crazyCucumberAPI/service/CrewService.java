package com.exampleMicroservice.crazyCucumberAPI.service;

import com.exampleMicroservice.crazyCucumberAPI.model.core.Crew;
import com.exampleMicroservice.crazyCucumberAPI.model.domain.CrewDO;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CrewService {

    List<Crew> getAll();

    Crew getCrewById (String id);
}
