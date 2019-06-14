package com.exampleMicroservice.crazyCucumberAPI.mapper;

import com.exampleMicroservice.crazyCucumberAPI.mapper.mappable.DOModelMappable;
import com.exampleMicroservice.crazyCucumberAPI.model.core.Crew;
import com.exampleMicroservice.crazyCucumberAPI.model.domain.CrewDO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {
        MoraleMapper.class})
public interface CrewMapper extends DOModelMappable<Crew, CrewDO> {

}
