package com.learnreactivespring.controller;


import com.learnreactivespring.model.Item;
import com.learnreactivespring.repository.ItemRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@Slf4j
public class ItemController {

    @Autowired
    private ItemRepository itemRepository;

    @GetMapping("/getItem/{id}")
    public ResponseEntity<Optional<Item>> getItemById(@PathVariable String id) {
        return new ResponseEntity<>(itemRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping("/saveItem")
    public ResponseEntity<Item> saveItem(@RequestBody Item item) {
        return new ResponseEntity<>(itemRepository.save(item), HttpStatus.OK);
    }
}
