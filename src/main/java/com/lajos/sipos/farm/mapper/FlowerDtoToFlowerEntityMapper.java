package com.lajos.sipos.farm.mapper;

import com.lajos.sipos.farm.domain.entity.FlowersEntity;
import com.lajos.sipos.farm.domain.model.FlowerDTO;
import org.springframework.stereotype.Component;

@Component
public class FlowerDtoToFlowerEntityMapper {
    public FlowersEntity mapDtoToEntity(FlowerDTO flowerDTO){
        return FlowersEntity.builder()
                .id(flowerDTO.getId())
                .flowerName(flowerDTO.getFlowerName())
                .quantity(flowerDTO.getQuantity())
                .price(flowerDTO.getPrice())
                .expire(flowerDTO.getExpire())
                .colour(flowerDTO.getColour())
                .pack(flowerDTO.getPack())
                .build();
    }
}
