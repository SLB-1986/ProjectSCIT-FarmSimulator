package com.lajos.sipos.farm.service;

import com.lajos.sipos.farm.domain.entity.FruitsEntity;
import com.lajos.sipos.farm.domain.model.FruitsDTO;
import com.lajos.sipos.farm.mapper.FruitsDtoToFruitsEntityMapper;
import com.lajos.sipos.farm.mapper.FruitsEntityToFruitsDtoMapper;
import com.lajos.sipos.farm.repository.FruitsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@AllArgsConstructor
public class FruitsServiceImpl implements FruitsService{
    private final FruitsRepository fruitsRepository;
    private final FruitsDtoToFruitsEntityMapper fruitsDtoToFruitsEntityMapper;
    private final FruitsEntityToFruitsDtoMapper fruitsEntityToFruitsDtoMapper;

    @Override
    public List<FruitsDTO> showFruits() {
        return fruitsRepository.findAll()
                .stream()
                .map(fruitsEntityToFruitsDtoMapper::mapEntityToDto)
                .collect(Collectors.toList());
    }

    @Override
    public FruitsDTO addFruits(FruitsDTO fruitsDTO){
        FruitsEntity fruitsEntity = fruitsDtoToFruitsEntityMapper.mapDtoToEntity(fruitsDTO);
        FruitsEntity saveEntity  = fruitsRepository.save(fruitsEntity);
        return fruitsEntityToFruitsDtoMapper.mapEntityToDto(saveEntity);
    }

    @Override
    public FruitsDTO updateFruits(int id, FruitsDTO fruitsDTO){
        FruitsEntity fruitsEntity = fruitsRepository.findById(id);
        fruitsEntity.setFruitsName(fruitsDTO.getFruitsName());
        fruitsEntity.setQuantity(fruitsDTO.getQuantity());
        fruitsEntity.setPrice(fruitsDTO.getPrice());
        fruitsEntity.setExpire(fruitsDTO.getExpire());
        FruitsEntity saveEntity = fruitsRepository.save(fruitsEntity);
        return fruitsEntityToFruitsDtoMapper.mapEntityToDto(saveEntity);
    }

    @Override
    public void deleteFruits(int deleteFruitsID){
        fruitsRepository.deleteById(deleteFruitsID);
    }

}
