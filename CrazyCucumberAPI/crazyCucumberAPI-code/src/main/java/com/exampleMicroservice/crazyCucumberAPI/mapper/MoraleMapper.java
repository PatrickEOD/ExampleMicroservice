package com.exampleMicroservice.crazyCucumberAPI.mapper;

import com.exampleMicroservice.crazyCucumberAPI.mapper.mappable.DOModelMappable;
import com.exampleMicroservice.crazyCucumberAPI.model.enumTypes.Morale;
import com.exampleMicroservice.crazyCucumberAPI.model.domain.enumTypes.MoraleDO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MoraleMapper extends DOModelMappable <Morale, String> {

    @Override
    default Morale fromDO(String s) {
        return Morale.fromValue(s);
    }

    @Override
    default String toDO(Morale morale) {
        return morale.toString();
    }
}
