package com.lajos.sipos.farm.repository;

import com.lajos.sipos.farm.domain.entity.AnimalEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends JpaRepository<AnimalEntity, Integer> {
    AnimalEntity findById(int id);
}
