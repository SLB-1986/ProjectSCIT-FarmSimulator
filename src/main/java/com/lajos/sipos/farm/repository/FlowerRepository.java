package com.lajos.sipos.farm.repository;

import com.lajos.sipos.farm.domain.entity.FlowersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlowerRepository extends JpaRepository<FlowersEntity, Integer> {
    FlowersEntity findById(int id);
}
