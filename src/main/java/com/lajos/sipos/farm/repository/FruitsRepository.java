package com.lajos.sipos.farm.repository;

import com.lajos.sipos.farm.domain.entity.FruitsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FruitsRepository extends JpaRepository<FruitsEntity, Integer> {
    FruitsEntity findById(int id);


}
