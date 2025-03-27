package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.MasterList;
import com.example.demo.services.MasterListService;

@RestController
@RequestMapping("/v2/master_list")
public class MasterListController {
	@Autowired
	private MasterListService service;

	@PostMapping
	public MasterList saveMasterList(@RequestBody MasterList masterList) {
		return service.saveMasterList(masterList);
	}

	@GetMapping
	public List<MasterList> getAllMasterLists() {
	    return service.getAllMasterLists();
	}
	
}

