package com.exampleMicroservice.crazyCucumberAPI.controller;

import com.exampleMicroservice.crazyCucumberAPI.model.Crew;
import com.exampleMicroservice.crazyCucumberAPI.service.CrewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1")
public class CrazyCucumberController {

    private final CrewService crewService;

    @Autowired
    public CrazyCucumberController (CrewService crewService) {
        this.crewService = crewService;
    }

    @GetMapping(value = "/crew",
        produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    ResponseEntity<List<Crew>> getAllCrews() {
        return ResponseEntity.ok(crewService.getAll());
    }

    @GetMapping(value = "/crew/{id}",
        produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    ResponseEntity<Crew> getCrewById(@PathVariable("id") String id) {
        return ResponseEntity.ok(crewService.getCrewById(id));
    }

}
