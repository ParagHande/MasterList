package com.example.demo.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.MasterList;
import com.example.demo.repository.MasterListRepository;

import java.util.List;

@Service
public class MasterListService {
    @Autowired
    private MasterListRepository repository;

    public MasterList saveMasterList(MasterList masterList) {
        return repository.save(masterList);
    }

    public List<MasterList> getAllMasterLists() {
        return repository.findAll();
    }
}
