package com.lajos.sipos.farm.service;

import com.lajos.sipos.farm.domain.entity.TreeEntity;
import com.lajos.sipos.farm.domain.model.TreeDTO;
import com.lajos.sipos.farm.mapper.TreeDtoToTreeEntityMapper;
import com.lajos.sipos.farm.mapper.TreeEntityToTreeDtoMapper;
import com.lajos.sipos.farm.repository.TreeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@AllArgsConstructor
public class TreeServiceImpl implements TreeService{

    private final TreeRepository treeRepository;
    private final TreeDtoToTreeEntityMapper treeDtoToTreeEntityMapper;
    private final TreeEntityToTreeDtoMapper treeEntityToTreeDtoMapper;

    @Override
    public List<TreeDTO> showTree() {
        return treeRepository.findAll()
                .stream()
                .map(treeEntityToTreeDtoMapper::mapEntityToDto)
                .collect(Collectors.toList());
    }

    @Override
    public TreeDTO addTree(TreeDTO treeDTO){
        TreeEntity treeEntity = treeDtoToTreeEntityMapper.mapDtoToEntity(treeDTO);
        TreeEntity saveEntity = treeRepository.save(treeEntity);
        return treeEntityToTreeDtoMapper.mapEntityToDto(saveEntity);
    }

    @Override
    public TreeDTO updateTree(int id, TreeDTO treeDTO){
        TreeEntity treeEntity = treeRepository.findById(id);
        treeEntity.setTreeName(treeDTO.getTreeName());
        treeEntity.setQuantity(treeDTO.getQuantity());
        treeEntity.setPrice(treeDTO.getPrice());
        treeEntity.setAge(treeDTO.getAge());
        TreeEntity saveEntity = treeRepository.save(treeEntity);
        return treeEntityToTreeDtoMapper.mapEntityToDto(saveEntity);
    }

    @Override
    public void deleteTree(int deleteTreeID){
        treeRepository.deleteById(deleteTreeID);
    }
}
