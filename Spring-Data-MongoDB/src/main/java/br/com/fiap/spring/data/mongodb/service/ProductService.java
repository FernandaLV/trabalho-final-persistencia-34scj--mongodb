package br.com.fiap.spring.data.mongodb.service;

import java.util.List;

import br.com.fiap.spring.data.mongodb.model.Product;

public interface ProductService {
	
	List<Product> getAllProduct();
	Product getProductById(String id);
	Product createProduct(Product customer);
	void updateProduct(Product customer);
	void deleteProduct(String id);

}
