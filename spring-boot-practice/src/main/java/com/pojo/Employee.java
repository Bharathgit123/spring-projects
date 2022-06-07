package com.pojo;

import com.sun.istack.NotNull;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Component
@Entity
@Table
public class Employee {

    static int a =5;

    @Id
    private Integer empid;

    private String empName;

    private Integer age;


    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }



}
