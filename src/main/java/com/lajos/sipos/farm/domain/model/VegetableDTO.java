package com.lajos.sipos.farm.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class VegetableDTO {
    private Integer id;
    private String vegName;
    private String quantity;
    private String price;
    private String expire;
}
