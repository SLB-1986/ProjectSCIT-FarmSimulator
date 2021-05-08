package com.lajos.sipos.farm.mapper;

import com.lajos.sipos.farm.domain.entity.AnimalEntity;
import com.lajos.sipos.farm.domain.model.AnimalDTO;
import org.springframework.stereotype.Component;

@Component
public class AnimalEntityToAnimalDtoMapper {
    public AnimalDTO mapEntityToDto(AnimalEntity animalEntity){
        return AnimalDTO.builder()
                .id(animalEntity.getId())
                .animalName(animalEntity.getAnimalName())
                .quantity(animalEntity.getQuantity())
                .price(animalEntity.getPrice())
                .age(animalEntity.getAge())
                .build();

    }

}
