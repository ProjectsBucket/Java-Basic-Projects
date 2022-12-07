package com.learnreactivespring.repository;

import com.learnreactivespring.model.Employee;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface EmployeeReactiveRepository extends ReactiveMongoRepository <Employee, String> {
    Mono<Employee> findByAdharId(String description);
}
