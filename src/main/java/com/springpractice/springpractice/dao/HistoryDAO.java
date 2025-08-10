package com.springpractice.springpractice.dao;

import com.springpractice.springpractice.entity.History;

import java.util.List;

public interface HistoryDAO {

    public void save(History history);

    public List<History> findAll();

    public History findByActionId(Integer actionId);

    public void update(History history);

    public void delete(History history);
}
