package com.ecommerce.project.service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.project.model.Product;
import com.ecommerce.project.model.Users;
import com.ecommerce.project.model.WishList;
import com.ecommerce.project.repository.ProductRepository;
import com.ecommerce.project.repository.UsersRepository;
import com.ecommerce.project.repository.WishListRepository;

@Service
public class WishListService {
	

	@Autowired
	WishListRepository listRepository;
	@Autowired
	ProductRepository productRepo;
	@Autowired
	UsersRepository user;
	
	
	public void saveWishList(WishList list) throws Exception {
		Product product=productRepo.findById(list.getProductId()).orElse(null);
		Users users=user.findById(list.getUsersId()).orElse(null);
		if (Objects.equals(product, users)) {
			throw new Exception("product and user is not avaible");
		}
		list.setProduct(product);
		list.setUsers(users);
		listRepository.save(list);
	}

}



