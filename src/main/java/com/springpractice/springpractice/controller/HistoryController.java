package com.springpractice.springpractice.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HistoryController {

    @GetMapping("/history")
    public String getHistory() {
        return "history read";
    }

    @PostMapping("history/add-action")
    public String addActionToHistory() {
        return "history create";
    }

    @PutMapping("history/update-action/{id}")
    public String updateActionInHistory() {
        return "history update";
    }

    @DeleteMapping("/history/delete/{id}")
    public String deleteActionFromHistory() {
        return "history delte";
    }

}
