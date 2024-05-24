package com.example.hibernate.controller;

import com.example.hibernate.dao.CreditRepository;
import com.example.hibernate.dao.RepositoryC;
import com.example.hibernate.dao.RepositoryCreditHistory;
import com.example.hibernate.dao.RepositoryH;
import com.example.hibernate.models.Credit;
import com.example.hibernate.models.CreditHistory;
import com.example.hibernate.models.Customer;
import com.example.hibernate.models.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import java.sql.Date;
import java.util.List;

@Controller
public class ControllerH {
    @Autowired
    RepositoryH repository;

    @Autowired
    RepositoryC repositoryC;

    @Autowired
    RepositoryCreditHistory repositoryCreditHistory;

    @Autowired
    CreditRepository creditRepository;

    @GetMapping("/lol")
    public String get(){
        Message message = repository.getReferenceById(1);
        System.out.println(message.getContent());
        return "lol";
    }

    @GetMapping("/qwerty")
    public String userCount(){
        Integer customer = repositoryC.countOfCustomers();
        Customer cus = repositoryC.findCustomerByEmail("dima@gmail.com");
        cus.setName("Dmitry");
        System.out.println(cus.getCreditHistory());
        System.out.println(cus);
        System.out.println(customer);
        return "lol";
    }

    @GetMapping("/sch")
    public String getSCH(){
        Customer customer = repositoryC.findCustomerByEmail("dima@gmail.com");
        CreditHistory creditHistory = new CreditHistory();
        creditHistory.setStart_date(new Date(2005,12, 12));
        creditHistory.setOpened(9);
        creditHistory.setClosed(10);
        repositoryCreditHistory.save(creditHistory);
        System.out.println(creditHistory);
        return "lol";
    }

    @GetMapping("/acdc")
    public String get12(){
        Credit credit = new Credit();
        Customer customer = new Customer();
        customer.setName("shd");
        customer.setCreditList(List.of(credit));
        credit.setCustomer(customer);
        creditRepository.save(credit);
        return "lol";
    }
}
