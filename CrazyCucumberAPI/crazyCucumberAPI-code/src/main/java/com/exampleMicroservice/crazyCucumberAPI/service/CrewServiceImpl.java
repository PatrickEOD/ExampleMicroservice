package com.exampleMicroservice.crazyCucumberAPI.service;

import com.exampleMicroservice.crazyCucumberAPI.model.Crew;
import com.exampleMicroservice.crazyCucumberAPI.model.enumTypes.Morale;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CrewServiceImpl implements CrewService {
    @Override
    public List<Crew> getAll() {
        List<Crew> crewList = new ArrayList<>();
        Crew crew1 = new Crew();
        crew1.setMembers(5L);
        crew1.setMorale(Morale.AVERAGE);
        crew1.setCombinedFirePower(10D);
        crewList.add(crew1);
        return crewList;
    }
}
