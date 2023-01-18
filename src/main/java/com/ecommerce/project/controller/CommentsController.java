package com.ecommerce.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.project.model.Comments;
import com.ecommerce.project.service.CommentsService;

@RestController
@RequestMapping("/comments")
public class CommentsController {
	

	@Autowired
	CommentsService commentsService;
	
	@PostMapping("/post")
	public Comments saveCommentTable(@RequestBody Comments comments) throws Exception {
		commentsService.saveComment(comments);
		return comments;
	}
}


