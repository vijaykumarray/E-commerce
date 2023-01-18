package com.ecommerce.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="sales_details ")
public class SalesDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private int id;
	//mapping
	@ManyToOne
	private Sales sales;

	//mapping 
	@ManyToOne
	private Product product;
	
	private int quantity;
	
	@Transient
	private int salesId;
	@Transient
	private int productId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Sales getSales() {
		return sales;
	}
	public void setSales(Sales sales) {
		this.sales = sales;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getSalesId() {
		return salesId;
	}
	public void setSalesId(int salesId) {
		this.salesId = salesId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	
}