package com.turkcell.turkcellcrm.searchService.dataAccess;

import com.turkcell.turkcellcrm.searchService.entities.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Collection;
import java.util.Optional;

public interface SearchProductRepository extends MongoRepository<Product, String> {
    Optional<Product> findProductByProductId(int productId);
    Collection<Product> findByCatalogIdAndProductIdAndName(int catalogId, int productId, String name);
}
