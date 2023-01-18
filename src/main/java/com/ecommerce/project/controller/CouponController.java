package com.ecommerce.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.project.model.Coupon;
import com.ecommerce.project.service.CouponService;

@RestController
@RequestMapping("/coupon")
public class CouponController {
	

	@Autowired
	CouponService couponService;
	
	@PostMapping("/post")
	public ResponseEntity<Coupon>saveCoupon(@RequestBody Coupon coupon){
		couponService.saveCoupon(coupon);
		return new ResponseEntity<>(coupon,HttpStatus.ACCEPTED);
	}

}



