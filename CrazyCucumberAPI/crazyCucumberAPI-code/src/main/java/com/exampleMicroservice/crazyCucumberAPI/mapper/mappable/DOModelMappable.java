package com.exampleMicroservice.crazyCucumberAPI.mapper.mappable;

public interface DOModelMappable<SOURCE, TARGET> {
    SOURCE fromDO(TARGET target);
    TARGET toDO(SOURCE source);
}
