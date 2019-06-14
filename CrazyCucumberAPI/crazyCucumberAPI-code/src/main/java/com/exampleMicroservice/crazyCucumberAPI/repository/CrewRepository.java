package com.exampleMicroservice.crazyCucumberAPI.repository;

import com.exampleMicroservice.crazyCucumberAPI.model.domain.CrewDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CrewRepository extends JpaRepository<CrewDO, String> {

    List<CrewDO> findAll();

    Optional<CrewDO> findCrewById(@Param("id") String id);
}
