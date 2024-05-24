package com.example.hibernate.dao;

import com.example.hibernate.models.Credit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreditRepository extends JpaRepository<Credit, Integer> {
}
