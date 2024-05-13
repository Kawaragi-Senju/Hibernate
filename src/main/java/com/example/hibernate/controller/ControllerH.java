package com.example.hibernate.controller;

import com.example.hibernate.dao.RepositoryC;
import com.example.hibernate.dao.RepositoryH;
import com.example.hibernate.models.Customer;
import com.example.hibernate.models.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.swing.text.DefaultEditorKit;

@Controller
public class ControllerH {
    @Autowired
    RepositoryH repository;

    @Autowired
    RepositoryC repositoryC;

    @GetMapping("/lol")
    public String get(){
        Message message = repository.getReferenceById(1);
        System.out.println(message.getContent());
        return "lol";
    }

    @GetMapping("/qwerty")
    public String userCount(){
        Integer customer = repositoryC.countOfCustomers();
        Customer cus = repositoryC.findCustomerByEmail("dannyboykov@bk.ru");
        System.out.println(cus);
        System.out.println(customer);
        return "lol";
    }
}
