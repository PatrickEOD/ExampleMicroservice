package com.exampleMicroservice.crazyCucumberAPI.model;

import com.exampleMicroservice.crazyCucumberAPI.model.enumTypes.Morale;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "crew")
@Data
@NoArgsConstructor
public class Crew {

    @Id
    @Column(name = "id", unique = true)
    @JsonIgnore
    private String id = null;

    @Column(name = "members")
    @JsonProperty("members")
    private String members = null;

    @Column(name = "combinedFirePower")
    @JsonProperty("combinedFirePower")
    private String combinedFirePower = null;

    @Column(name = "morale")
    @JsonProperty("morale")
    private Morale morale = null;
}
