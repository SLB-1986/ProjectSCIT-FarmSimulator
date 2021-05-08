package com.lajos.sipos.farm.controller;

import com.lajos.sipos.farm.domain.model.OrderDto;
import com.lajos.sipos.farm.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping("/addOrder/{animalId}/{flowerId}/{fruitId}/{treeId}/{vegId}")
    public OrderDto addOrder(@PathVariable(name = "animalId") int animalId,
                             @PathVariable(name = "flowerId") int flowerId,
                             @PathVariable(name = "fruitId") int fruitId,
                             @PathVariable(name = "treeId") int treeId,
                             @PathVariable(name = "vegId") int vegId) {

        return orderService.addOrder(animalId, flowerId, fruitId, treeId, vegId);
    }

    @GetMapping("/orders")
    public List<OrderDto> getOrders(){
        return orderService.getOrders();
    }

    @DeleteMapping("/delete/order/{id}")
    public void deleteOrder (@PathVariable (name = "id")int id){
        orderService.deleteOrder(id);
    }



}
