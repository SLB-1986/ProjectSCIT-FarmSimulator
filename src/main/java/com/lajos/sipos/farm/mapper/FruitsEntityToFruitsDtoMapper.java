package com.lajos.sipos.farm.mapper;


import com.lajos.sipos.farm.domain.entity.FruitsEntity;
import com.lajos.sipos.farm.domain.model.FruitsDTO;
import org.springframework.stereotype.Component;

@Component
public class FruitsEntityToFruitsDtoMapper {
    public FruitsDTO mapEntityToDto(FruitsEntity fruitsEntity){
        return FruitsDTO.builder()
                .id(fruitsEntity.getId())
                .fruitsName(fruitsEntity.getFruitsName())
                .quantity(fruitsEntity.getQuantity())
                .price(fruitsEntity.getPrice())
                .expire(fruitsEntity.getExpire())
                .build();

    }
}
