package com.lajos.sipos.farm.service;

import com.lajos.sipos.farm.domain.model.AnimalDTO;

import java.util.List;

public interface AnimalService {
    List<AnimalDTO> showAnimal ();
    AnimalDTO addAnimal(AnimalDTO animalDTO);
    AnimalDTO updateAnimal(int id, AnimalDTO animalDTO);
    void deleteAnimal(int deleteAnimalID);
}
