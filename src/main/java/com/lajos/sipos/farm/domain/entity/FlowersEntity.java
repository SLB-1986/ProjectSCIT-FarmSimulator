package com.lajos.sipos.farm.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
@Table(name = "flowers")
public class FlowersEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column (name = "flower_name")
    private String flowerName;

    private String quantity;
    private String price;
    private String expire;
    private String colour;
    private String pack;

}
