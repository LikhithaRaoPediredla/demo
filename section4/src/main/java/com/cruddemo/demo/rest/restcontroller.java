package com.cruddemo.demo.rest;

import com.cruddemo.demo.dao.empdaoimpli;
import com.cruddemo.demo.dao.employeedao;
import com.cruddemo.demo.entity.employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class restcontroller {
    private employeedao edao;

    public restcontroller(employeedao edao) {
        this.edao = edao;
    }

    @GetMapping("/employees")
    public List<employee> findall(){
       return edao.findall();
    }
}
