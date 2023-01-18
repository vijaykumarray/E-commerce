package com.ecommerce.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.project.model.Size;
import com.ecommerce.project.repository.SizeRepository;

@Service
public class SizeService {


	@Autowired
	SizeRepository sizeRepository;
	
	public void saveSize(Size size) {
		sizeRepository.save(size);
	}

}

