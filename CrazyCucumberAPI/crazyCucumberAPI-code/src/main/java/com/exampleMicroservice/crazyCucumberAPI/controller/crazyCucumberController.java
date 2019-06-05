package com.exampleMicroservice.crazyCucumberAPI.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1")
public class crazyCucumberController {

    @GetMapping("/getCrew",
        produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    ResponseEntity<Crew> getAllCrew() {
        return ResponseEntity.ok(crewService.getAll());
    }

}
