package com.lajos.sipos.farm.service;

import com.lajos.sipos.farm.domain.model.VegetableDTO;

import java.util.List;

public interface VegService {
    List<VegetableDTO> showVegetables ();

    VegetableDTO addVegetable(VegetableDTO vegetableDTO);

    VegetableDTO updateVeg(int id, VegetableDTO vegetableDTO);

    void deleteVeg(int deleteVegID);
}
