package br.com.fiap.spring.data.mongodb.repository;

import br.com.fiap.spring.data.mongodb.model.SalesOrder;
import org.springframework.data.mongodb.repository.MongoRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface SalesOrderRepository extends MongoRepository<SalesOrder, String> {

}
