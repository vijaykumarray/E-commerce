package com.ecommerce.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.project.model.Color;
import com.ecommerce.project.repository.ColorRepository;

@Service
public class ColorService {
	

	@Autowired
	ColorRepository colorRepository;
	
	public void saveColor(Color color) {
		colorRepository.save(color);
		
	}

}



