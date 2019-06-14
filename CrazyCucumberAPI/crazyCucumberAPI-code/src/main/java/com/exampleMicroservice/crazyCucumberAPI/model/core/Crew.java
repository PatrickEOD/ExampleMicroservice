package com.exampleMicroservice.crazyCucumberAPI.model.core;

import com.exampleMicroservice.crazyCucumberAPI.model.enumTypes.Morale;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class Crew implements Serializable {

    @JsonIgnore
    private String id;

    @JsonProperty("members")
    private String members;

    @JsonProperty("combinedFirePower")
    private String combinedFirePower;

    @JsonProperty("morale")
    private Morale morale;
}
