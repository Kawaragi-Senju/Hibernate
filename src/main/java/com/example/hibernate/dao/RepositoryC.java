package com.example.hibernate.dao;

import com.example.hibernate.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryC extends JpaRepository<Customer, Integer> {
    public Customer findCustomerByEmail(String email);
    @Query(value="select count(*) from customers", nativeQuery = true)
    public Integer countOfCustomers();
}
