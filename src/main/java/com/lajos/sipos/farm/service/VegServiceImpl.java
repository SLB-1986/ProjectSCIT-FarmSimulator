package com.lajos.sipos.farm.service;

import com.lajos.sipos.farm.domain.entity.VegetableEntity;
import com.lajos.sipos.farm.domain.model.VegetableDTO;
import com.lajos.sipos.farm.mapper.VegDtoToVegEntityMapper;
import com.lajos.sipos.farm.mapper.VegEntityToVegDtoMapper;
import com.lajos.sipos.farm.repository.VegRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;


@Service
@Transactional
@AllArgsConstructor
public class VegServiceImpl implements VegService{

    private final VegRepository vegRepository;
    private final VegDtoToVegEntityMapper vegDtoToVegEntityMapper;
    private final VegEntityToVegDtoMapper vegEntityToVegDtoMapper;

    @Override
    public List<VegetableDTO> showVegetables() {
        return vegRepository.findAll()
                .stream()
                .map(vegEntityToVegDtoMapper::mapEntityToDto)
                .collect(Collectors.toList());
    }

    @Override
    public VegetableDTO addVegetable(VegetableDTO vegetableDTO){
        VegetableEntity vegetableEntity = vegDtoToVegEntityMapper.mapDtoToEntity(vegetableDTO);
        VegetableEntity saveEntity  = vegRepository.save(vegetableEntity);
        return vegEntityToVegDtoMapper.mapEntityToDto(saveEntity);
    }

    @Override
    public VegetableDTO updateVeg(int id, VegetableDTO vegetableDTO){
        VegetableEntity vegetableEntity = vegRepository.findById(id);
        vegetableEntity.setVegName(vegetableDTO.getVegName());
        vegetableEntity.setQuantity(vegetableDTO.getQuantity());
        vegetableEntity.setPrice(vegetableDTO.getPrice());
        vegetableEntity.setExpire(vegetableDTO.getExpire());
        VegetableEntity saveEntity = vegRepository.save(vegetableEntity);
        return vegEntityToVegDtoMapper.mapEntityToDto(saveEntity);
    }

    @Override
    public void deleteVeg(int deleteVegID){
        vegRepository.deleteById(deleteVegID);
    }

}
