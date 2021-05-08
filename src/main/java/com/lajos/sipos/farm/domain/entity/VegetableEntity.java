package com.lajos.sipos.farm.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
@Table(name = "vegetable")
public class VegetableEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "veg_name")
    private String vegName;

//    @Column(name = "quantity")
    private String quantity;
//    @Column(name = "price")
    private String price;
//    @Column(name = "expire")
    private String expire;
}
