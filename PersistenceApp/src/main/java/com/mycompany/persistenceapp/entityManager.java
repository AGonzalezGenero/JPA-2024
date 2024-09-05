package com.mycompany.persistenceapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class entityManager {
    public static void entityManager(String[] args){
        EntityManagerFactory emf = persistence.createEntityManagerFactory("EjemploPersistenciaPU");
        EntityManager em =  emf.createEntityManager();
    }
}