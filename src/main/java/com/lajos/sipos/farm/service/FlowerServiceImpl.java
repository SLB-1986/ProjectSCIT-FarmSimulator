package com.lajos.sipos.farm.service;


import com.lajos.sipos.farm.domain.entity.FlowersEntity;
import com.lajos.sipos.farm.domain.model.FlowerDTO;
import com.lajos.sipos.farm.mapper.FlowerDtoToFlowerEntityMapper;
import com.lajos.sipos.farm.mapper.FlowerEntityToFlowerDtoMapper;
import com.lajos.sipos.farm.repository.FlowerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@AllArgsConstructor
public class FlowerServiceImpl implements FlowerService{

    private final FlowerRepository flowerRepository;
    private final FlowerDtoToFlowerEntityMapper flowerDtoToFlowerEntityMapper;
    private final FlowerEntityToFlowerDtoMapper flowerEntityToFlowerDtoMapper;

    @Override
    public List<FlowerDTO> showFlower() {
        return flowerRepository.findAll()
                .stream()
                .map(flowerEntityToFlowerDtoMapper::mapEntityToDto)
                .collect(Collectors.toList());
    }

    @Override
    public FlowerDTO addFlower(FlowerDTO flowerDTO){
        FlowersEntity flowersEntity = flowerDtoToFlowerEntityMapper.mapDtoToEntity(flowerDTO);
        FlowersEntity saveEntity = flowerRepository.save(flowersEntity);
        return flowerEntityToFlowerDtoMapper.mapEntityToDto(saveEntity);
    }

    @Override
    public FlowerDTO updateFlower(int id, FlowerDTO flowerDTO){
        FlowersEntity flowersEntity = flowerRepository.findById(id);
        flowersEntity.setFlowerName(flowerDTO.getFlowerName());
        flowersEntity.setQuantity(flowerDTO.getQuantity());
        flowersEntity.setPrice(flowerDTO.getPrice());
        flowersEntity.setExpire(flowerDTO.getExpire());
//        flowersEntity.setColour(flowerDTO.getColour);
//        flowersEntity.setPack(flowerDTO.getPack);
        FlowersEntity saveEntity = flowerRepository.save(flowersEntity);
        return flowerEntityToFlowerDtoMapper.mapEntityToDto(saveEntity);
    }

    @Override
    public void deleteFlower(int deleteFlowerID){
        flowerRepository.deleteById(deleteFlowerID);
    }
}
