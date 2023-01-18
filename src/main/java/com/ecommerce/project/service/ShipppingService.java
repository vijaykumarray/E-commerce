package com.ecommerce.project.service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.project.model.City;
import com.ecommerce.project.model.Shipping;
import com.ecommerce.project.repository.CityRepository;
import com.ecommerce.project.repository.ShippingRepository;

@Service
public class ShipppingService {
	

	@Autowired
	ShippingRepository shippingRepository;
	@Autowired
	CityRepository cityRepository;
	
	public void saveShipping(Shipping shipping) throws Exception {
		City city=cityRepository.findById(shipping.getCityId()).orElse(null);
		if (Objects.isNull(city)) {
			throw new Exception("city value no persent");
			
		}
		shipping.setCity(city);
		shippingRepository.save(shipping);
	}

}



