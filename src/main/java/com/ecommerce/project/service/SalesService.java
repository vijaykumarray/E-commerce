package com.ecommerce.project.service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.project.model.Sales;
import com.ecommerce.project.model.Shipping;
import com.ecommerce.project.model.Users;
import com.ecommerce.project.repository.SalesRepository;
import com.ecommerce.project.repository.ShippingRepository;
import com.ecommerce.project.repository.UsersRepository;

@Service
public class SalesService {
	
	
	@Autowired
	SalesRepository salesRepository;
	
	@Autowired
	UsersRepository usersRepo;
	
	@Autowired
	ShippingRepository shippingRepository;
	
	
	public void saveSales(Sales sales) throws Exception {
		
		Users users=usersRepo.findById(sales.getUserId()).orElse(null);
		Shipping shipping=shippingRepository.findById(sales.getShippingId()).orElse(null);
		if (Objects.isNull(shipping)) {
			
			throw new Exception("Shipping is not availble ");
		}
		if (Objects.isNull(users)) {
			throw new Exception("no users");
			
		}
		sales.setShipping(shipping);
		sales.setUser(users);
		salesRepository.save(sales);
		
	}

}
