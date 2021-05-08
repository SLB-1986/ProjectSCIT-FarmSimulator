package com.lajos.sipos.farm.service;

import com.lajos.sipos.farm.domain.model.FruitsDTO;

import java.util.List;

public interface FruitsService {
    List<FruitsDTO> showFruits();
    FruitsDTO addFruits(FruitsDTO fruitsDTO);
    FruitsDTO updateFruits(int id, FruitsDTO fruitsDTO);
    void deleteFruits(int deleteFruitID);
}
