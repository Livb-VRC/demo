package com.example.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public abstract class EntityDao<T>  {

    private Class<T> myEntity;

    @PersistenceContext
    EntityManager entityManager;

    public void setMyClass( Class<T> myEntity) {
        this.myEntity = myEntity;
    }

    public void save (T entity) {
        this.entityManager.persist(entity);
    }

    public T findById(Long id) {
        return this.entityManager.find(myEntity, id);
    }

    public List<T> findAll() {
        return this.entityManager.createQuery( "from " + myEntity.getName()).getResultList();
    }

    public void update (T entity) {
        this.entityManager.merge(entity);
    }

    public void delete (Long id) {
        T entity = this.findById(id);
        this.entityManager.remove(entity);
    }

}
