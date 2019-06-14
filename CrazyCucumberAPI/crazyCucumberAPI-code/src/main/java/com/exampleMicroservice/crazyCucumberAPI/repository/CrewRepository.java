package com.exampleMicroservice.crazyCucumberAPI.repository;

import com.exampleMicroservice.crazyCucumberAPI.model.Crew;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CrewRepository extends JpaRepository<Crew, String> {

    List<Crew> findAll();

    Optional<Crew> findCrewById(@Param("id") String id);
}
