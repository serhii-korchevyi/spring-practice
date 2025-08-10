package com.springpractice.springpractice.service;

import com.springpractice.springpractice.dao.HistoryDAOImpl;
import com.springpractice.springpractice.entity.History;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HistoryService {

    private final HistoryDAOImpl historyDAOImpl;

    @Autowired
    public HistoryService(HistoryDAOImpl historyDAOImpl) {
        this.historyDAOImpl = historyDAOImpl;
    }

    public String getHistory() {
        return "history read";
    }

    public void addActionToHistory() {
        History history = new History("bet", 1, 1, 10.00);
        this.historyDAOImpl.save(history);
    }

    public List<History> getHistoryList() {
        return this.historyDAOImpl.findAll();
    }

    public void historyActionUpdate(int actionId) {
        History history =  this.historyDAOImpl.findByActionId(actionId);
        history.setAmount(20.00);
        this.historyDAOImpl.update(history);
    }

    public void historyActionDelete(int actionId) {
        History history =  this.historyDAOImpl.findByActionId(actionId);
        this.historyDAOImpl.delete(history);
    }

}
