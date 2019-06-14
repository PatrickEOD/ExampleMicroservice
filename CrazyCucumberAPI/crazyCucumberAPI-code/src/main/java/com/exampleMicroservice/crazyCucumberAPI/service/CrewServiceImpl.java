package com.exampleMicroservice.crazyCucumberAPI.service;

import com.exampleMicroservice.crazyCucumberAPI.mapper.CrewMapper;
import com.exampleMicroservice.crazyCucumberAPI.model.core.Crew;
import com.exampleMicroservice.crazyCucumberAPI.repository.CrewRepository;
import com.exampleMicroservice.crazyCucumberAPI.model.domain.CrewDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CrewServiceImpl implements CrewService {

    private final CrewRepository crewRepository;
    private final CrewMapper crewMapper;

    @Autowired
    public CrewServiceImpl (CrewRepository crewRepository, CrewMapper crewMapper) {
        this.crewRepository = crewRepository;
        this.crewMapper = crewMapper;
    }

    @Override
    public List<Crew> getAll() {
        List<CrewDO> crewDO = crewRepository.findAll();
        List<Crew> crew = crewDO.stream()
                .map(m -> {
                    return crewMapper.fromDO(m);
                }).collect(Collectors.toList());
        return crew;
    }

    // TODO catch error if optional is not present
    @Override
    public Crew getCrewById(String id) {
        Optional<CrewDO> crewDO = crewRepository.findCrewById(id);
        Crew crew = crewMapper.fromDO(crewDO.get());
        return crew;
    }


}
