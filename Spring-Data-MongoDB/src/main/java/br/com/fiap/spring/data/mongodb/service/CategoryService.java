package br.com.fiap.spring.data.mongodb.service;

import br.com.fiap.spring.data.mongodb.model.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAllCategories();
    Category getCategoryById(String id);
    Category createCategory(Category category);
    void updateCategory(Category category);
    void deleteCategory(String id);
}