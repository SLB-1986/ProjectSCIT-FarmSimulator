package com.lajos.sipos.farm.controller;

import com.lajos.sipos.farm.domain.model.AnimalDTO;
import com.lajos.sipos.farm.service.AnimalService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class AnimalController {
    private final AnimalService animalService;

    @GetMapping("/animal")
    public List<AnimalDTO> getAllAnimal (){
        return animalService.showAnimal();
    }

    @PostMapping("/addAnimal")
    public AnimalDTO addAnimal(@RequestBody AnimalDTO animalDTO){
        return animalService.addAnimal(animalDTO);
    }

    @PutMapping("/updateAnimal/{animalId}")
    public AnimalDTO updateAnimal(@PathVariable(name = "animalId") int animalId, @RequestBody AnimalDTO animalDTO){
        return animalService.updateAnimal(animalId, animalDTO);
    }

    @DeleteMapping("/delete/{animalId}")
    public void deleteAnimal (@PathVariable(name = "animalId") int animalId){
        animalService.deleteAnimal(animalId);
    }
}
