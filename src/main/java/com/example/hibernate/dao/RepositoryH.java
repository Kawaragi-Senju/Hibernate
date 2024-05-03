package com.example.hibernate.dao;

import com.example.hibernate.models.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryH extends JpaRepository<Message, Integer>{
}
