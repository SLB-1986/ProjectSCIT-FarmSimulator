package com.lajos.sipos.farm.mapper;

import com.lajos.sipos.farm.domain.entity.OrderEntity;
import com.lajos.sipos.farm.domain.model.OrderDto;
import org.springframework.stereotype.Component;

@Component
public class OrderEntityToOrderDtoMapper {

    public OrderDto mapEntityToDto (OrderEntity orderEntity){
        return OrderDto.builder()
                .id(orderEntity.getId())
                .animalEntity(orderEntity.getAnimalEntity())
                .flowersEntity(orderEntity.getFlowersEntity())
                .fruitsEntity(orderEntity.getFruitsEntity())
                .treeEntity(orderEntity.getTreeEntity())
                .vegetableEntity(orderEntity.getVegetableEntity())
                .build();

    }

}
