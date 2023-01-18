package com.ecommerce.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="productTags")

public class ProductTags {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private int id;
	// mapping
	@ManyToOne
	private Product product;
	// maping
	@ManyToOne
	private Tags tags;
	@Transient
	private int productId;
	@Transient
	private int tagsId;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getTagsId() {
		return tagsId;
	}
	public void setTagsId(int tagsId) {
		this.tagsId = tagsId;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Tags getTags() {
		return tags;
	}
	public void setTags(Tags tags) {
		this.tags = tags;
	}
	
	
	

}
