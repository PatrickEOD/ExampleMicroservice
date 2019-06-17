package com.exampleMicroservice.crazyCucumberAPI.model.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "ship")
@Data
@NoArgsConstructor
public class ShipDO {

    @Id
    @Column(name = "id", length = 25, nullable = false, unique = true)
    private String id;

    @Column(name = "name", length = 100, nullable = false)
    private String name;

    //TODO ManyToOne
//    @Column(name = "captain", length = 100)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ships")
    private CaptainDO captain;

    //TODO OneToOne
//    @Column(name = "crew", length = 20, nullable = false, unique = true)
    @OneToOne
    @JoinColumn(name = "ship_id")
    private CrewDO crew;

    //TODO change to type object (name as reference)
    @Column(name = "type", length = 50, nullable = false)
    private String type;

    //TODO change to cannons object
    @Column(name = "cannons", length = 20)
    private String cannons;

    @Column(name = "sails", length = 20, nullable = false)
    private String sails;

    @Column(name = "speed", length = 20, nullable = false)
    private String speed;

    @Column(name = "max_sails", length = 20, nullable = false)
    private String maxSails;
}
