package com.ecommerce.project.service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.project.model.Comments;
import com.ecommerce.project.model.Product;
import com.ecommerce.project.model.Users;
import com.ecommerce.project.repository.CommentsRepository;
import com.ecommerce.project.repository.ProductRepository;
import com.ecommerce.project.repository.UsersRepository;

@Service
public class CommentsService {
	

	@Autowired
	CommentsRepository commentsRepository;

	@Autowired
	UsersRepository usersRepository;

	@Autowired
	ProductRepository productRepository;

	public void saveComment(Comments comments) throws Exception {
		Users users = usersRepository.findById(comments.getUserId()).orElse(null);
		Product product = productRepository.findById(comments.getProductId()).orElse(null);

		if (Objects.isNull(product)) {
			throw new Exception("no product table present");

		}
		if (Objects.isNull(users)) {
			throw new Exception("no present");
		}

		comments.setProduct(product);
		comments.setUser(users);
		commentsRepository.save(comments);

	}

}



