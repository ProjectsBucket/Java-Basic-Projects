package com.poc.service;

import com.poc.exception.ItemNotFoundException;
import com.poc.model.Item;
import com.poc.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Objects;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public Flux<Item> getItems() {
        return itemRepository.findAll();
    }

    public Mono<Item> getByItemId(int id) {
        return  itemRepository.findById(id);
    }

    public Mono<Void> deleteItem(int id) {
        final Mono<Item> item = getByItemId(id);
        if (Objects.isNull(item)) {
            return Mono.empty();
        }
        return itemRepository.deleteById(id);
    }

    public Mono<Item> updateItem(int id, Mono<Item> item) {
        return itemRepository.findById(id)
                .flatMap(p->item
                        .doOnNext(i-> i.setId(id)))
                .flatMap(itemRepository::save);
    }

    public Mono<Item> saveItem(Item item) {
        return itemRepository.save(item);
    }
}
