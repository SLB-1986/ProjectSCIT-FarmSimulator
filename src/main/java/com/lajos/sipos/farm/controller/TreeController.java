package com.lajos.sipos.farm.controller;


import com.lajos.sipos.farm.domain.model.TreeDTO;
import com.lajos.sipos.farm.service.TreeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class TreeController {

    private final TreeService treeService;

    @GetMapping("/tree")
    public List<TreeDTO> getAllTree (){
        return treeService.showTree();
    }

    @PostMapping("/addTree")
    public TreeDTO addTree(@RequestBody TreeDTO treeDTO){
        return treeService.addTree(treeDTO);
    }

    @PutMapping("/updateTree/{treeId}")
    public TreeDTO updateFruits(@PathVariable(name = "treeId") int treeId, @RequestBody TreeDTO treeDTO){
        return treeService.updateTree(treeId, treeDTO);
    }

    @DeleteMapping("/delete/{treeId}")
    public void deleteTree (@PathVariable(name = "treeId") int treeId){
        treeService.deleteTree(treeId);
    }
}
