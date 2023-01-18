package com.ecommerce.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.project.model.Tags;
import com.ecommerce.project.repository.TagsRepository;
@Service
public class TagsService {
	

	@Autowired
	TagsRepository tagsRepository;
	
	public void saveTags(Tags tags) {
		tagsRepository.save(tags);
	}
}



