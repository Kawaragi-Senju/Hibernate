package com.example.hibernate.dao;

import com.example.hibernate.models.CreditHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryCreditHistory extends JpaRepository<CreditHistory, Integer> {
}
