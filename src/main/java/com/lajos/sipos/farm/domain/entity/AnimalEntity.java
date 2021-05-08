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
@Table (name = "animals")
public class AnimalEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;

    @Column (name = "animal_name")
    private String animalName;

    private String quantity;
    private String price;
    private String age;

}
