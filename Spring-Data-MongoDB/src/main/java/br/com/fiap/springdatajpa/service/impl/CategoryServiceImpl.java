package br.com.fiap.springdatajpa.service.impl;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import br.com.fiap.springdatajpa.advice.ResponseError;
import br.com.fiap.springdatajpa.model.Category;
import br.com.fiap.springdatajpa.repository.CategoryRepository;
import br.com.fiap.springdatajpa.repository.ProductRepository;
import br.com.fiap.springdatajpa.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	private CategoryRepository categoryRepository;
	private ProductRepository productRepository;

	@Autowired
	public CategoryServiceImpl(final ProductRepository productRepository, final CategoryRepository categoryRepository) {
		this.productRepository = productRepository;
		this.categoryRepository = categoryRepository;
	};

	@Override
	public List<Category> getAllCategories() {
		List<Category> categories = StreamSupport.stream(categoryRepository.findAll().spliterator(), false)
				.collect(Collectors.toList());
		return categories;
	}

	@Override
	public Category getCategoryById(String id) {
		return categoryRepository.findById(id)
				.orElseThrow(() -> new ResponseError(HttpStatus.NOT_FOUND, "Categoria não encontrada"));
	}

	@Override
	public Category createCategory(Category category) {
		return categoryRepository.save(category);
	}

	@Override
	public void updateCategory(Category category) {
		Category storedCayegory = categoryRepository.findById(category.getId())
				.orElseThrow(() -> new ResponseError(HttpStatus.NOT_FOUND, "Categoria não encontrada"));

		storedCayegory.setName(category.getName());

		categoryRepository.save(storedCayegory);
	}

	@Override
	public void deleteCategory(String id) {
		Category category = categoryRepository.findById(id)
				.orElseThrow(() -> new ResponseError(HttpStatus.NOT_FOUND, "Categoria não encontrada"));

		if (productRepository.findByCategory(id).size() > 0) {
			throw new ResponseError(HttpStatus.UNPROCESSABLE_ENTITY,
					"Não é possível excluir a categoria, pois ela tem produtos associados");
		}

		categoryRepository.delete(category);
	}
}
