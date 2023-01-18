package com.ecommerce.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.project.model.Coupon;
import com.ecommerce.project.repository.CouponRepository;

@Service

public class CouponService {
	

	@Autowired
	CouponRepository couponRepository;
	
	public void saveCoupon(Coupon coupon) {
		couponRepository.save(coupon);
	}

}


