package com.lajos.sipos.farm.mapper;

import com.lajos.sipos.farm.domain.entity.VegetableEntity;
import com.lajos.sipos.farm.domain.model.VegetableDTO;
import org.springframework.stereotype.Component;

@Component
public class VegDtoToVegEntityMapper {

    public VegetableEntity mapDtoToEntity(VegetableDTO vegetableDTO){
        return VegetableEntity.builder()
                .id(vegetableDTO.getId())
                .vegName(vegetableDTO.getVegName())
                .quantity(vegetableDTO.getQuantity())
                .price(vegetableDTO.getPrice())
                .expire(vegetableDTO.getExpire())
                .build();
    }

}
