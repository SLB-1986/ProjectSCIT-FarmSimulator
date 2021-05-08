package com.lajos.sipos.farm.service;

import com.lajos.sipos.farm.domain.model.FlowerDTO;

import java.util.List;

public interface FlowerService {
    List<FlowerDTO> showFlower ();
    FlowerDTO addFlower(FlowerDTO flowerDTO);
    FlowerDTO updateFlower(int id, FlowerDTO flowerDTO);
    void deleteFlower(int deleteFlowerID);
}
