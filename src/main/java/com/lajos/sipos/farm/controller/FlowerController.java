package com.lajos.sipos.farm.controller;

import com.lajos.sipos.farm.domain.model.FlowerDTO;
import com.lajos.sipos.farm.service.FlowerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class FlowerController {
    private final FlowerService flowerService;

    @GetMapping("/flower")
    public List<FlowerDTO> getAllFlower (){
        return flowerService.showFlower();
    }

    @PostMapping("/addFlower")
    public FlowerDTO addFlower(@RequestBody FlowerDTO flowerDTO){
        return flowerService.addFlower(flowerDTO);
    }

    @PutMapping("/updateFlower/{flowerId}")
    public FlowerDTO updateFlower(@PathVariable(name = "flowerId") int flowerId, @RequestBody FlowerDTO flowerDTO){
        return flowerService.updateFlower(flowerId, flowerDTO);
    }

    @DeleteMapping("/delete/{flowerId}")
    public void deleteFlower (@PathVariable(name = "flowerId") int flowerId){
        flowerService.deleteFlower(flowerId);
    }
}
