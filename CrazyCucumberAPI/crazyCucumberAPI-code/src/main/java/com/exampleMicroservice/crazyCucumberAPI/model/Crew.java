package com.exampleMicroservice.crazyCucumberAPI.model;

import com.exampleMicroservice.crazyCucumberAPI.model.enumTypes.Morale;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "crew")
@Data
@NoArgsConstructor
public class Crew implements Serializable {

    @Id
    @Column(name = "id", length = 25, nullable = false, unique = true)
    private String id;

    @Column(name = "members", length = 20)
    @JsonProperty("members")
    private String members;

    @Column(name = "combined_fire_power", length = 20)
    @JsonProperty("combinedFirePower")
    private String combinedFirePower;

    @Enumerated(EnumType.STRING)
    @Column(name = "morale", length  = 100)
    @JsonProperty("morale")
    private Morale morale;
}
