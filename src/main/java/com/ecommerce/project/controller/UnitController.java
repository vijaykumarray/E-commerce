package com.ecommerce.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.project.model.Unit;
import com.ecommerce.project.service.UnitService;

@RestController
@RequestMapping("/unit")
public class UnitController {
	

	@Autowired
	UnitService unitTableService;
	
	@PostMapping("/post")
	public Unit saveUnit(@RequestBody Unit unitTable) {
		unitTableService.saveUnit(unitTable);
		return unitTable;
	}
}


