package br.com.fiap.spring.data.mongodb.service.impl;

import br.com.fiap.spring.data.mongodb.model.Product;
import br.com.fiap.spring.data.mongodb.repository.ProductRepository;
import br.com.fiap.spring.data.mongodb.service.CategoryService;
import br.com.fiap.spring.data.mongodb.advice.ResponseError;
import br.com.fiap.spring.data.mongodb.model.Category;
import br.com.fiap.spring.data.mongodb.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class CategoryServiceImpl implements CategoryService {
	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<Category> getAllCategories() {
		List<Category> categories= StreamSupport.stream(categoryRepository.findAll().spliterator(), false)
				.collect(Collectors.toList());
		return categories;
	}

	@Override
	public Category getCategoryById(String id) {
		return categoryRepository.findById(id).orElseThrow(() ->
				new ResponseError(HttpStatus.NOT_FOUND, "Categoria não encontrada"));
	}

	@Override
	public Category createCategory(Category category) {
		return categoryRepository.save(category);
	}

	@Override
	public void updateCategory(Category category) {
		Category storedCayegory = categoryRepository.findById(category.getId()).orElseThrow(() ->
				new ResponseError(HttpStatus.NOT_FOUND, "Categoria não encontrada"));

		storedCayegory.setName(category.getName());

		categoryRepository.save(storedCayegory);
	}

	@Override
	public void deleteCategory(String id) {
		Category category = categoryRepository.findById(id).orElseThrow(() ->
				new ResponseError(HttpStatus.NOT_FOUND, "Categoria não encontrada"));

		List<Product> products = productRepository.findAll();

		for (Product product : products) {
			for (Category categoryItem : product.getCategories()) {
				if (category.getId().equals(categoryItem.getId()))
					throw new ResponseError(HttpStatus.UNPROCESSABLE_ENTITY, "Não é possível excluir a categoria, pois ela tem produtos associados");
			}
		}

		categoryRepository.delete(category);
	}
}
