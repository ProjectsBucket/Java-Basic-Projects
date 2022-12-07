package com.poc.controller;

import com.poc.model.Item;
import com.poc.service.ItemService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import reactor.core.CoreSubscriber;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
public class ItemControllerTest {

    @Mock
    private ItemService itemService;

    private  ItemController itemController;

    @Test
    public void testGetByItemId() {

        Mono<Item> itemMono = Mono
                .just(new Item(1,"Item","some item"));
        when(itemService.getByItemId(Mockito.anyInt())).thenReturn(itemMono);
        Mono<Item> actualItem = itemController.getByItemId(1);

        assertEquals(actualItem, itemMono);
    }

    @Test
    public void testGetAllItem() {
        Flux<Item> items = Flux
                .just(new Item(1,"Item","Item desc"),
                        new Item(2,"Item2","some desc"));
        when(itemService.getItems()).thenReturn(items);
        Flux<Item> actualItems = itemController.getItems();

        assertEquals(actualItems, items);
    }

    @Test
    public void testUpdateItem() {
        Mono<Item> item = Mono
                .just(new Item(1,"Item1","Item desc"));
        when(itemService.updateItem(1,item)).thenReturn(item);
        Mono<Item> actualItem = itemController.updateById(item,1);

        assertEquals(actualItem, item);
    }

    @Test
    public void testSave() {
        Item item = new Item(1,"Item2","item desc");
        Mono<Item> itemMono = Mono
                .just(item);
        when(itemService.saveItem(item)).thenReturn(itemMono);
        Mono<Item> actual = itemController.save(item);
        assertEquals(actual, itemMono);
    }

    @Test
    public void testDelete() {
        Mono<Void> val=new Mono<Void>() {

            @Override
            public void subscribe(CoreSubscriber<? super Void> actual) {
                // TODO Auto-generated method stub

            }
        };
        when(itemService.deleteItem(1)).thenReturn(val);
        itemController.delete(1);

        verify(itemService.deleteItem(1));
    }

}
