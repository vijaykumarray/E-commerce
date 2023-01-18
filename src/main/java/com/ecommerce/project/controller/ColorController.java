package com.ecommerce.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.project.model.Color;
import com.ecommerce.project.service.ColorService;

@RestController
@RequestMapping("/color")
public class ColorController {

	@Autowired
	ColorService colorService;
	
	@PostMapping("/post")
	public Color saveColor(@RequestBody Color color) {
		colorService.saveColor(color);
		return color;
	}

}



