package com.lajos.sipos.farm.repository;

import com.lajos.sipos.farm.domain.entity.TreeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TreeRepository extends JpaRepository<TreeEntity, Integer> {
    TreeEntity findById(int id);
}
