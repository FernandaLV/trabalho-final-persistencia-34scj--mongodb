package br.com.fiap.spring.data.mongodb;

import br.com.fiap.spring.data.mongodb.repository.CategoryRepository;
import br.com.fiap.spring.data.mongodb.repository.CustomerRepository;
import br.com.fiap.spring.data.mongodb.repository.InventoryRepository;
import br.com.fiap.spring.data.mongodb.repository.ProductRepository;
import br.com.fiap.spring.data.mongodb.repository.SalesOrderRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackageClasses = { CategoryRepository.class, CustomerRepository.class,
		InventoryRepository.class, ProductRepository.class, SalesOrderRepository.class })
public class SpringDataMongoDBApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataMongoDBApplication.class, args);
	}

}
