package com.lajos.sipos.farm.mapper;

import com.lajos.sipos.farm.domain.entity.FruitsEntity;
import com.lajos.sipos.farm.domain.model.FruitsDTO;
import org.springframework.stereotype.Component;

@Component
public class FruitsDtoToFruitsEntityMapper {
    public FruitsEntity mapDtoToEntity(FruitsDTO fruitsDTO){
        return FruitsEntity.builder()
                .id(fruitsDTO.getId())
                .fruitsName(fruitsDTO.getFruitsName())
                .quantity(fruitsDTO.getQuantity())
                .price(fruitsDTO.getPrice())
                .expire(fruitsDTO.getExpire())
                .build();
    }
}
