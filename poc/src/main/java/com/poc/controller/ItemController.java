package com.poc.controller;

import com.poc.model.Item;
import com.poc.service.ItemService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.validation.Valid;

@RestController
@RequestMapping("/app")
@Slf4j
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping("/items")
    public Flux<Item> getItems() {
        return itemService.getItems();
    }

    @GetMapping("/item/{id}")
    public Mono<Item> getByItemId(@PathVariable("id")  int id) {
        return itemService.getByItemId(id);
    }

    @PutMapping("/item/{id}")
    public Mono<Item> updateById(@Valid @RequestBody Mono<Item> Item, @PathVariable("id")  int id) {
        return itemService.updateItem(id, Item);
    }

    @PostMapping("/item")
    public Mono<Item> save(@Valid @RequestBody Item Item) {
        return itemService.saveItem(Item);
    }

    @DeleteMapping("/item/{id}")
    public Mono<Void> delete(@PathVariable  int id) {
        return itemService.deleteItem(id);
    }

}
