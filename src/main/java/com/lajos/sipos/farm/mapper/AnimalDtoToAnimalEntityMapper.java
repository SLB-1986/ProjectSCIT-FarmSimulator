package com.lajos.sipos.farm.mapper;

import com.lajos.sipos.farm.domain.entity.AnimalEntity;
import com.lajos.sipos.farm.domain.model.AnimalDTO;
import org.springframework.stereotype.Component;

@Component
public class AnimalDtoToAnimalEntityMapper {
    public AnimalEntity mapDtoToEntity(AnimalDTO animalDTO){
        return AnimalEntity.builder()
                .id(animalDTO.getId())
                .animalName(animalDTO.getAnimalName())
                .quantity(animalDTO.getQuantity())
                .price(animalDTO.getPrice())
                .age(animalDTO.getAge())
                .build();
    }
}
