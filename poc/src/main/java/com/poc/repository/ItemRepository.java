package com.poc.repository;

import com.poc.model.Item;
import org.springframework.data.repository.reactive.ReactiveSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends ReactiveSortingRepository<Item, Integer> {
}
