package com.ecommerce.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.project.model.Tags;
import com.ecommerce.project.service.TagsService;

@RestController
@RequestMapping("/tags")
public class TagsController {
	
	
	@Autowired
	TagsService tagsService;
	
	@PostMapping("/post")
	public ResponseEntity<Tags> saveTags(@RequestBody Tags tags){
		tagsService.saveTags(tags);
		return new ResponseEntity<> (tags,HttpStatus.ACCEPTED);
	}
}
