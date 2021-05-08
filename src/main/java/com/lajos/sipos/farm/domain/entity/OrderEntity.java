package com.lajos.sipos.farm.domain.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@Table (name = "orders")
public class OrderEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "animal_Id", referencedColumnName = "id")
    private AnimalEntity animalEntity;

    @OneToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "flower_Id", referencedColumnName = "id")
    private FlowersEntity flowersEntity;

    @OneToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "fruit_Id", referencedColumnName = "id")
    private FruitsEntity fruitsEntity;

    @OneToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "tree_Id", referencedColumnName = "id")
    private TreeEntity treeEntity;

    @OneToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "vegetable_Id", referencedColumnName = "id")
    private VegetableEntity vegetableEntity;


}
