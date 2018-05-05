package com.politecnica_workshops.springboot_test.controller;

import com.politecnica.operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class operation_control {


    private operation opr;

    @RequestMapping(value="/suma")
    public int doOperation(@RequestParam int a,@RequestParam int b){
        return opr.suma(a,b);
    }

    @Autowired
    public void setOperation(operation opr){
        this.opr = opr;
    }
}