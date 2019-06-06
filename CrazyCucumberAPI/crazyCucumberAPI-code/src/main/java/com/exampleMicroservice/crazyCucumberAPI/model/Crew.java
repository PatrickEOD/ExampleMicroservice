package com.exampleMicroservice.crazyCucumberAPI.model;

import com.exampleMicroservice.crazyCucumberAPI.model.enumTypes.Morale;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.Id;

@Data
public class Crew {

    @Id
    @JsonIgnore
    private Long id;

    @JsonProperty("members")
    private Long members;

    @JsonProperty("combinedFirePower")
    private Double combinedFirePower;

    @JsonProperty("morale")
    private Morale morale;
}
