package com.sau.db;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class AppDB {

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");


    public static void main(String[] args) {
        Student s=getir(2);
        System.out.println("Gelen Kayıt:"+ s.getName());
    }
public static Student getir(int id){
    EntityManager em=emf.createEntityManager();
    em.getTransaction().begin();
    Student st=em.find(Student.class, id);
    em.getTransaction().commit();
    return st;
}

}
