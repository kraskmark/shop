package com.example.demo.dao;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class PurchaseDaoImpl implements PurchaseDao {
    @PersistenceContext
    EntityManager entityManager;
}
