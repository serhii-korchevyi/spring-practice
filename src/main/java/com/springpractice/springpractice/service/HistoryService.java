package com.springpractice.springpractice.service;

import org.springframework.stereotype.Component;

@Component
public class HistoryService {

    public String getHistory() {
        return "history read";
    }
}
