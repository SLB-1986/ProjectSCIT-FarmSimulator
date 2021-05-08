package com.lajos.sipos.farm.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class FruitsDTO {
    private Integer id;
    private String fruitsName;
    private String quantity;
    private String price;
    private String expire;
}
