package com.lajos.sipos.farm.service;

import com.lajos.sipos.farm.domain.model.OrderDto;

import java.util.List;

public interface OrderService {
    OrderDto addOrder(int animalId, int flowerId, int fruitId, int treeId, int vegId);

    List<OrderDto> getOrders();

    void deleteOrder(int id);
}
