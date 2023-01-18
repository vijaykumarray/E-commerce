package com.ecommerce.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.project.model.Unit;
import com.ecommerce.project.repository.UnitRepository;

@Service
public class UnitService {
	

	@Autowired
	UnitRepository unitTableRepo;
	
	public void saveUnit(Unit unit) {
		unitTableRepo.save(unit);
	}

}


