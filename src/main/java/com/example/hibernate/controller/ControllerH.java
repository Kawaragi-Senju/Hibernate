package com.example.hibernate.controller;

import com.example.hibernate.dao.RepositoryH;
import com.example.hibernate.models.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerH {
    @Autowired
    RepositoryH repository;

    @GetMapping("/lol")
    public String get(){
        Message message = repository.getReferenceById(1);
        System.out.println(message.getContent());
        return "lol";
    }
}
