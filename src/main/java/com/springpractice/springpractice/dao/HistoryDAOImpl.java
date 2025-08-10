package com.springpractice.springpractice.dao;

import com.springpractice.springpractice.entity.History;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class HistoryDAOImpl implements HistoryDAO {

    private EntityManager em;

    @Autowired
    public HistoryDAOImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    @Transactional
    public void save(History history) {
        this.em.persist(history);
    }

    @Override
    public List<History> findAll() {
        return this.em.createQuery("FROM History", History.class).getResultList();
    }

    @Override
    public History findByActionId(Integer actionId) {
        return this.em.find(History.class, actionId);
    }

    @Override
    @Transactional
    public void update(History history) {
        this.em.merge(history);
    }

    @Override
    @Transactional
    public void delete(History history) {
        this.em.remove(history);
    }
}
