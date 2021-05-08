package com.lajos.sipos.farm.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class AnimalDTO {
    private Integer id;
    private String animalName;
    private String quantity;
    private String price;
    private String age;
}
