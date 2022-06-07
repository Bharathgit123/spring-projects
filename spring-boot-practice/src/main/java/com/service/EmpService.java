package com.service;

import com.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.Disposable;
import reactor.core.publisher.Mono;

@Component
public class EmpService {

    @Autowired
    private Employee empobj;


    public Mono<Employee> empStore(Employee emp) {





  return  WebClient
          .create("http://localhost:8080").post()
                .uri("api/getEmp/01")
          .body(Mono.just(emp),Employee.class)
          .retrieve()
          .bodyToMono(Employee.class);
 }


}
