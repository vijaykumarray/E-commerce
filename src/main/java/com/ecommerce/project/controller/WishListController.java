package com.ecommerce.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.project.model.WishList;
import com.ecommerce.project.service.WishListService;

@RestController
@RequestMapping("/wishlist")
public class WishListController {
	

	@Autowired
	WishListService listService;
	
	@PostMapping("/post")
	public ResponseEntity<WishList>saveWishList(@RequestBody WishList list) throws Exception{
		listService.saveWishList(list);
		return new ResponseEntity<> (list, HttpStatus.ACCEPTED);
	}

}


