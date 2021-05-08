package com.lajos.sipos.farm.domain.model;

import com.lajos.sipos.farm.domain.entity.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class OrderDto {

    private int id;

    private AnimalEntity animalEntity;
    private FlowersEntity flowersEntity;
    private FruitsEntity fruitsEntity;
    private TreeEntity treeEntity;
    private VegetableEntity vegetableEntity;

}
