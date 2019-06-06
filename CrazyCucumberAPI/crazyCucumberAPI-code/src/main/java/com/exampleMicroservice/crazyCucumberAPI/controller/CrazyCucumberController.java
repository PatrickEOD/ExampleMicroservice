package com.exampleMicroservice.crazyCucumberAPI.controller;

import com.exampleMicroservice.crazyCucumberAPI.model.Crew;
import com.exampleMicroservice.crazyCucumberAPI.service.CrewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping(value = "/getCrew",
        produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    ResponseEntity<List<Crew>> getAllCrew() {
        return ResponseEntity.ok(crewService.getAll());
    }

}
