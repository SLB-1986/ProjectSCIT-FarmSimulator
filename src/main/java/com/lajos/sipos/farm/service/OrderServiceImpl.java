package com.lajos.sipos.farm.service;

import com.lajos.sipos.farm.domain.entity.*;
import com.lajos.sipos.farm.domain.model.OrderDto;
import com.lajos.sipos.farm.mapper.OrderDtoToOrderEntityMapper;
import com.lajos.sipos.farm.mapper.OrderEntityToOrderDtoMapper;
import com.lajos.sipos.farm.repository.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@AllArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    private final AnimalRepository animalRepository;
    private final FlowerRepository flowerRepository;
    private final FruitsRepository fruitsRepository;
    private final TreeRepository treeRepository;
    private final VegRepository vegRepository;

    private final OrderEntityToOrderDtoMapper orderEntityToOrderDtoMapper;
    private final OrderDtoToOrderEntityMapper orderDtoToOrderEntityMapper;

    @Override
    public OrderDto addOrder(int animalId, int flowerId, int fruitId, int treeId, int vegId) {

        AnimalEntity animalEntity = animalRepository.findById(animalId);
        FlowersEntity flowersEntity = flowerRepository.findById(flowerId);
        FruitsEntity fruitsEntity = fruitsRepository.findById(fruitId);
        TreeEntity treeEntity = treeRepository.findById(treeId);
        VegetableEntity vegetableEntity = vegRepository.findById(vegId);

        OrderEntity orderEntity = OrderEntity.builder()
                .animalEntity(animalEntity)
                .flowersEntity(flowersEntity)
                .fruitsEntity(fruitsEntity)
                .treeEntity(treeEntity)
                .vegetableEntity(vegetableEntity)
                .build();

        OrderEntity saveEntity = orderRepository.save(orderEntity);
        return orderEntityToOrderDtoMapper.mapEntityToDto(saveEntity);
    }

    @Override
    public List<OrderDto> getOrders() {
        return orderRepository.findAll()
                .stream()
                .map(orderEntityToOrderDtoMapper::mapEntityToDto)
                .collect(Collectors.toList());
    }

    @Override
    public void deleteOrder (int id){
        orderRepository.deleteById(id);
    }

}