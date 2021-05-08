package com.lajos.sipos.farm.controller;

import com.lajos.sipos.farm.domain.model.FruitsDTO;
import com.lajos.sipos.farm.service.FruitsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class FruitsController {

        private final FruitsService fruitsService;

        @GetMapping("/fruits")
        public List<FruitsDTO> getAllFruits (){
            return fruitsService.showFruits();
        }

        @PostMapping("/addFruits")
        public FruitsDTO addFruits(@RequestBody FruitsDTO fruitsDTO){
            return fruitsService.addFruits(fruitsDTO);
        }

        @PutMapping("/updateFruits/{fruitsId}")
        public FruitsDTO updateFruits(@PathVariable(name = "fruitsId") int fruitsId, @RequestBody FruitsDTO fruitsDTO){
            return fruitsService.updateFruits(fruitsId, fruitsDTO);
        }

        @DeleteMapping("/delete/{fruitsId}")
        public void deleteFruits (@PathVariable(name = "fruitsId") int fruitsId){
            fruitsService.deleteFruits(fruitsId);
        }

}
