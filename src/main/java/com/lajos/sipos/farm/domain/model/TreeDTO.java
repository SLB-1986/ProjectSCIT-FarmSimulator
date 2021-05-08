package com.lajos.sipos.farm.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class TreeDTO {
    private Integer id;
    private String treeName;
    private String quantity;
    private String price;
    private String age;
}
