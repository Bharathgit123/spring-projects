package com.controller;


import com.Exception.ResourceNotFound;
import com.app.EmpRepository;
import com.app.SpringBootApplication;
import com.pojo.Employee;
import com.service.EmpService;
import org.apache.tomcat.util.http.parser.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@Scope(value = "singleton")

public class OfficeResource {
    @Autowired
    private EmpService empService;

    @PostMapping(value="/storeEmp",consumes = "application/json")
    public String storeEmployee( @RequestBody Employee empDetails) {

        System.out.println(empDetails);

      return empDetails.getEmpName();

    }

}
