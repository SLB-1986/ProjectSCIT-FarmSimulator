package com.lajos.sipos.farm.service;

import com.lajos.sipos.farm.domain.model.TreeDTO;

import java.util.List;

public interface TreeService {
    List<TreeDTO> showTree ();
    TreeDTO addTree(TreeDTO treeDTO);
    TreeDTO updateTree(int id, TreeDTO treeDTO);
    void deleteTree(int deleteTreeID);
}
