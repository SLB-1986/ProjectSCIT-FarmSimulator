package com.lajos.sipos.farm.mapper;

import com.lajos.sipos.farm.domain.entity.VegetableEntity;
import com.lajos.sipos.farm.domain.model.VegetableDTO;
import org.springframework.stereotype.Component;

@Component
public class VegEntityToVegDtoMapper {

    public VegetableDTO mapEntityToDto(VegetableEntity vegetableEntity){
        return VegetableDTO.builder()
                .id(vegetableEntity.getId())
                .vegName(vegetableEntity.getVegName())
                .quantity(vegetableEntity.getQuantity())
                .price(vegetableEntity.getPrice())
                .expire(vegetableEntity.getExpire())
                .build();

    }

}
