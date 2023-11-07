package com.cruddemo.demo.dao;

import com.cruddemo.demo.entity.employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class empdaoimpli implements employeedao {
    private EntityManager EM;
    @Autowired
    public empdaoimpli(EntityManager EM) {
        this.EM = EM;
    }

    @Override
    public List<employee> findall() {
        TypedQuery<employee> theq= EM.createQuery("from employee", employee.class);
        List<employee>employees= theq.getResultList();
        return employees;
    }
}
