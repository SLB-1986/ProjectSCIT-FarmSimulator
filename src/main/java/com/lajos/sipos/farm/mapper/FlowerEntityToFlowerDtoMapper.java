package com.lajos.sipos.farm.mapper;

import com.lajos.sipos.farm.domain.entity.FlowersEntity;
import com.lajos.sipos.farm.domain.model.FlowerDTO;
import org.springframework.stereotype.Component;

@Component
public class FlowerEntityToFlowerDtoMapper {
    public FlowerDTO mapEntityToDto(FlowersEntity flowersEntity){
            return FlowerDTO.builder()
            .id(flowersEntity.getId())
            .flowerName(flowersEntity.getFlowerName())
            .quantity(flowersEntity.getQuantity())
            .price(flowersEntity.getPrice())
            .expire(flowersEntity.getExpire())
            .colour(flowersEntity.getColour())
            .pack(flowersEntity.getPack())
            .build();
    }
}
