package com.lajos.sipos.farm.mapper;

import com.lajos.sipos.farm.domain.entity.OrderEntity;
import com.lajos.sipos.farm.domain.model.OrderDto;
import org.springframework.stereotype.Component;

@Component
public class OrderDtoToOrderEntityMapper {

    public OrderEntity mapDtoToEntity (OrderDto orderDto){
        return OrderEntity.builder()
                .id(orderDto.getId())
                .animalEntity(orderDto.getAnimalEntity())
                .flowersEntity(orderDto.getFlowersEntity())
                .fruitsEntity(orderDto.getFruitsEntity())
                .treeEntity(orderDto.getTreeEntity())
                .vegetableEntity(orderDto.getVegetableEntity())
                .build();
    }

}
