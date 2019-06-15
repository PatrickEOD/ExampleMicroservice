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

    @Column(name = "crew_name", length = 100, nullable = false, unique = true)
    private String crewName;

    //TODO from String change to PIRATE object
    @Column(name = "pirates", length = 20)
    private String pirate = null;

    @Column(name = "pirates_amount", length = 20, nullable = false)
    private String piratesAmount = "0";

    @Column(name = "men_fire_power", nullable = false)
    private String menFirePower = "0";

    @Enumerated(EnumType.STRING)
    @Column(name = "morale", length  = 100, nullable = false)
    private Morale morale = Morale.AVERAGE;

    //TODO ManyToOne
    @Column(name = "captain", length = 100, nullable = false)
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn()
    private CaptainDO captain;

    //TODO OneToOne
    @Column(name = "ship_id", length = 20)
    private ShipDO ships;
}
