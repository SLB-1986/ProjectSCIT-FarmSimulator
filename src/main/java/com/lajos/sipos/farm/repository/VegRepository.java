package com.lajos.sipos.farm.repository;

import com.lajos.sipos.farm.domain.entity.VegetableEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VegRepository extends JpaRepository <VegetableEntity, Integer> {
    VegetableEntity findById(int id);
}
