package com.restcrud.demo.rest;

import com.restcrud.demo.entity.student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api")
public class sturest {
    private List<student>thestudent;
    @PostConstruct
    public void loaddata(){
        thestudent=new ArrayList<>();
        thestudent.add(new student("likhi","rao"));
        thestudent.add(new student("rakesh","babe"));
        thestudent.add(new student("zoo","jon"));
    }
    @GetMapping("/students")
    public List<student> studentslist(){

        return thestudent;
    }

    @GetMapping("/students/{studentId}")
    public student studentID(@PathVariable int studentId){
        if(studentId>thestudent.size()-1||studentId<0){
            throw new studentnotfoundexception("student not found:"+studentId);
        }
        return thestudent.get(studentId);
    }

}
