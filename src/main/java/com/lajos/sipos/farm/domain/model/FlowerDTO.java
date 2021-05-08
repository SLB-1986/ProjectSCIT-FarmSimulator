package com.lajos.sipos.farm.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class FlowerDTO {
    private Integer id;
    private String flowerName;
    private String quantity;
    private String price;
    private String expire;
    private String colour;
    private String pack;
}
