package com.exampleMicroservice.crazyCucumberAPI.model.domain;

import com.exampleMicroservice.crazyCucumberAPI.model.enumTypes.Morale;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "crew")
@Data
@NoArgsConstructor
public class CrewDO implements Serializable {

    @Id
    @Column(name = "id", length = 25, nullable = false, unique = true)
    private String id;

    @Column(name = "members", length = 20)
    private String members;

    @Column(name = "combined_fire_power", length = 20)
    private String combinedFirePower;

    @Enumerated(EnumType.STRING)
    @Column(name = "morale", length  = 100)
    private Morale morale;
}
