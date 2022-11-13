package com.example.doctor_patient.service;

import com.example.doctor_patient.model.Product;

import java.util.List;

public interface ProductService {
	public Product saveProduct(Product product);

	public List<Product> getAllProduct();

	public Product getProductById(Integer id);

	public String deleteProduct(Integer id);

	public Product editProduct(Product product,Integer id);
}
