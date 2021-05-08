package com.lajos.sipos.farm.repository;

import com.lajos.sipos.farm.domain.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository <OrderEntity, Integer>{

}
