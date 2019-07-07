package br.com.fiap.spring.data.mongodb.repository;

import br.com.fiap.spring.data.mongodb.model.Category;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Repository
public interface CategoryRepository extends MongoRepository<Category, String> {

    Optional<List<Category>> findByIdIn(Collection<String> ids);
}
