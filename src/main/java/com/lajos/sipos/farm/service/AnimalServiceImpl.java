package com.lajos.sipos.farm.service;

import com.lajos.sipos.farm.domain.entity.AnimalEntity;
import com.lajos.sipos.farm.domain.model.AnimalDTO;
import com.lajos.sipos.farm.mapper.AnimalDtoToAnimalEntityMapper;
import com.lajos.sipos.farm.mapper.AnimalEntityToAnimalDtoMapper;
import com.lajos.sipos.farm.repository.AnimalRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@AllArgsConstructor
public class AnimalServiceImpl implements AnimalService{
    private final AnimalRepository animalRepository;
    private final AnimalDtoToAnimalEntityMapper animalDtoToAnimalEntityMapper;
    private final AnimalEntityToAnimalDtoMapper animalEntityToAnimalDtoMapper;

    @Override
    public List<AnimalDTO> showAnimal() {
        return animalRepository.findAll()
                .stream()
                .map(animalEntityToAnimalDtoMapper::mapEntityToDto)
                .collect(Collectors.toList());
    }

    @Override
    public AnimalDTO addAnimal(AnimalDTO animalDTO){
        AnimalEntity animalEntity = animalDtoToAnimalEntityMapper.mapDtoToEntity(animalDTO);
        AnimalEntity saveEntity = animalRepository.save(animalEntity);
        return animalEntityToAnimalDtoMapper.mapEntityToDto(saveEntity);
    }

    @Override
    public AnimalDTO updateAnimal(int id, AnimalDTO animalDTO){
        AnimalEntity animalEntity = animalRepository.findById(id);
        animalEntity.setAnimalName(animalDTO.getAnimalName());
        animalEntity.setQuantity(animalDTO.getQuantity());
        animalEntity.setPrice(animalDTO.getPrice());
        animalEntity.setAge(animalDTO.getAge());
        AnimalEntity saveEntity = animalRepository.save(animalEntity);
        return animalEntityToAnimalDtoMapper.mapEntityToDto(saveEntity);
    }

    @Override
    public void deleteAnimal(int deleteAnimalID){
        animalRepository.deleteById(deleteAnimalID);
    }
}
