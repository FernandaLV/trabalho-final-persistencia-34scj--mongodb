package br.com.fiap.springdatajpa.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.springdatajpa.model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer>{
	@Query("{category:?1}")
	List<String> findByCategory(String idCategory);
}
