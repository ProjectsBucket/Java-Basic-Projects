package com.poc.service;

import com.poc.controller.ItemController;
import com.poc.model.Item;
import com.poc.repository.ItemRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import reactor.core.CoreSubscriber;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
public class ItemServiceTest {

    @Mock
    private ItemRepository itemRepository;

    @InjectMocks
    private ItemService itemService;

    @Test
    public void testGetByItemId() {

        Mono<Item> item = Mono
                .just(new Item(1,"Item1","something"));
        when(itemService.getByItemId(1)).thenReturn(item);
        Mono<Item> actual = itemService.getByItemId(1);

        assertEquals(item, actual);
    }

    @Test
    public void testGetAllItem() {
        Flux<Item> items = Flux
                .just(new Item(1,"Item2","some desc"),
                        new Item(2,"Item3","Item desc"));
        when(itemRepository.findAll()).thenReturn(items);
        Flux<Item> actualItems = itemService.getItems();

        assertEquals(items, actualItems);
    }

//    @Test
//    public void testUpdateItem() {
//        Mono<Item> item = Mono
//                .just(new Item(1,"Item4","Item4 desc"));
//      when(itemRepository.save(1,item)).thenReturn(item);
//       itemService.updateById(item,1);
//    }

    @Test
    public void testSave() {
        Item item = new Item(1,"Item4","Item4 desc");
        Mono<Item> itemMono = Mono
                .just(new Item(2,"Item5","Item5 desc"));
        when(itemRepository.save(item)).thenReturn(itemMono);
        itemService.saveItem(item);
    }

    @Test
    public void testDelete() {
        Mono<Void> val=new Mono<Void>() {

            @Override
            public void subscribe(CoreSubscriber<? super Void> actual) {
                // TODO Auto-generated method stub

            }
        };
        when(itemRepository.deleteById(Mockito.anyInt())).thenReturn(val);
        itemService.deleteItem(2);
    }
}
