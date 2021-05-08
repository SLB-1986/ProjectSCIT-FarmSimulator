package com.lajos.sipos.farm.mapper;

import com.lajos.sipos.farm.domain.entity.TreeEntity;
import com.lajos.sipos.farm.domain.model.TreeDTO;
import org.springframework.stereotype.Component;

@Component
public class TreeDtoToTreeEntityMapper {
    public TreeEntity mapDtoToEntity(TreeDTO treeDTO){
        return TreeEntity.builder()
                .id(treeDTO.getId())
                .treeName(treeDTO.getTreeName())
                .quantity(treeDTO.getQuantity())
                .price(treeDTO.getPrice())
                .age(treeDTO.getAge())
                .build();
    }
}
