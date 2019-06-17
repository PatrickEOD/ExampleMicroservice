package com.exampleMicroservice.crazyCucumberAPI.model.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "captain")
@Data
@NoArgsConstructor
public class CaptainDO {

    @Id
    @Column(name = "id", length = 25, nullable = false, unique = true)
    private String id;

    @Column(name = "name", length = 120, nullable = false, unique = true)
    private String name;

    //TODO OneToOne with Account object
    @Column(name = "account", length = 20, nullable = false, unique = true)
    private String account;

    //TODO OneToMany
//    @Column(name = "crews", length = 100, unique = true)
    @OneToMany(mappedBy = "captain", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CrewDO> crews;

    //TODO OneToMany
//    @Column(name = "ships", length = 100, unique = true)
    @OneToMany(mappedBy = "captain", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ShipDO> ships;
}
