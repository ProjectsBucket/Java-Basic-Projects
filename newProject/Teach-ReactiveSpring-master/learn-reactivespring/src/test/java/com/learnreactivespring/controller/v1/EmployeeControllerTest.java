package com.learnreactivespring.controller.v1;

import com.learnreactivespring.constants.ItemConstants;
import com.learnreactivespring.model.Employee;
import com.learnreactivespring.repository.EmployeeReactiveRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

@SpringBootTest
@RunWith(SpringRunner.class)
@DirtiesContext
@AutoConfigureWebTestClient
@ActiveProfiles("test")
public class EmployeeControllerTest {

    @Autowired
    WebTestClient webTestClient;

    @Autowired
    EmployeeReactiveRepository employeeReactiveRepository;

    public List<Employee> data() {

        return Arrays.asList(new Employee("44", "Sam","Stella",  "879876549"),
                new Employee("22", "Demon", "IT", "889578987654"),
                new Employee("33", "Stafen", "Comm", "465756768787"),
                new Employee("11", "Brad","management", "57865685568"));
    }


    @Before
    public void setUp(){
        employeeReactiveRepository.deleteAll()
                .thenMany(Flux.fromIterable(data()))
                .flatMap(employeeReactiveRepository::save)
                .doOnNext((emp -> {
                    System.out.println("Added employee is : " + emp);
                }))
                .blockLast();
    }


    @Test
    public void getAllItems(){
        webTestClient.get().uri(ItemConstants.ITEM_END_POINT_V1)
                .exchange()
                .expectStatus().isOk()
                .expectHeader().contentType(MediaType.APPLICATION_JSON)
                .expectBodyList(com.learnreactivespring.document.Item.class)
                .hasSize(4);

    }

    @Test
    public void getOneItem(){

        webTestClient.get().uri("/{id}","ABC")
                .exchange()
                .expectStatus().isOk()
                .expectBody()
                .jsonPath("$.price", 149.99);

    }

}
