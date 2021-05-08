package com.lajos.sipos.farm.controller;

import com.lajos.sipos.farm.domain.model.VegetableDTO;
import com.lajos.sipos.farm.service.VegService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class VegController {
    private final VegService vegService;

    @GetMapping("/vegetables")
    public List<VegetableDTO> getAllVegetables (){
        return vegService.showVegetables();
    }

    @PostMapping("/addVeg")
    public VegetableDTO addVegetable(@RequestBody VegetableDTO vegetableDTO){
        return vegService.addVegetable(vegetableDTO);
    }

    @PutMapping("/updateVeg/{vegId}")
    public VegetableDTO updateVegetable(@PathVariable(name = "vegId") int vegId, @RequestBody VegetableDTO vegetableDTO){
        return vegService.updateVeg(vegId, vegetableDTO);
    }

    @DeleteMapping("/delete/{vegId}")
    public void deleteVeg (@PathVariable(name = "vegId") int vegId){
        vegService.deleteVeg(vegId);
    }

}
