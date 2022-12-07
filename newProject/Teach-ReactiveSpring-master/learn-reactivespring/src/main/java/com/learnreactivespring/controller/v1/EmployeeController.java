package com.learnreactivespring.controller.v1;

import com.learnreactivespring.model.Employee;
import com.learnreactivespring.repository.EmployeeReactiveRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import static com.learnreactivespring.constants.ItemConstants.ITEM_END_POINT_V1;

@RestController
@Slf4j
public class EmployeeController {

    @Autowired
    private EmployeeReactiveRepository employeeReactiveRepository;


    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<String> handleRuntimeException(RuntimeException ex){
        log.error("Exception caught in handleRuntimeException :  {} " , ex);
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ex.getMessage());
    }

    @GetMapping("/getAllEmployee")
    public Flux<Employee> getAllEmployee(){
        return employeeReactiveRepository.findAll();

    }


    @RequestMapping("/getEmployee/{id}")
    public Mono<ResponseEntity<Employee>> getEmployee(@PathVariable String id){
        return  employeeReactiveRepository.findById(id)
                .map((item-> new ResponseEntity<>(item, HttpStatus.OK)))
                .defaultIfEmpty(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @RequestMapping("/emp/getMessage")
    public ResponseEntity<String> getMessage() {
        return new ResponseEntity<>("Hello check this msg to confirm", HttpStatus.OK);
    }


    @PostMapping("/addEmployee")
    public ResponseEntity<Mono<Employee>> addEmployee(@RequestBody Employee emp){

        return new ResponseEntity<>(employeeReactiveRepository.save(emp), HttpStatus.CREATED);
    }

    @PutMapping("updateEmpDetail/{id}")
    public Mono<ResponseEntity<Employee>> updateEmployeeDetail(@PathVariable String id,
                                                                                  @RequestBody Employee employee){

        return employeeReactiveRepository.findById(id)
                .flatMap(emp -> {

                    emp.setName(emp.getName());
                    emp.setDepartment(emp.getDepartment());
                    return employeeReactiveRepository.save(emp);
                })
                .map(newEmpDetail -> new ResponseEntity<>(newEmpDetail, HttpStatus.OK))
                .defaultIfEmpty(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

}
