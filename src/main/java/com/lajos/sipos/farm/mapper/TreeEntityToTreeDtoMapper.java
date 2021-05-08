package com.lajos.sipos.farm.mapper;

import com.lajos.sipos.farm.domain.entity.TreeEntity;
import com.lajos.sipos.farm.domain.model.TreeDTO;
import org.springframework.stereotype.Component;

@Component
public class TreeEntityToTreeDtoMapper {
    public TreeDTO mapEntityToDto(TreeEntity treeEntity){
        return TreeDTO.builder()
                .id(treeEntity.getId())
                .treeName(treeEntity.getTreeName())
                .quantity(treeEntity.getQuantity())
                .price(treeEntity.getPrice())
                .age(treeEntity.getAge())
                .build();

    }
}
