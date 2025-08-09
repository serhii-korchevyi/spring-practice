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
    public String updateActionInHistory(@PathVariable Long id) {
        return "history update with id " + id;
    }

    @DeleteMapping("/history/delete/{id}")
    public String deleteActionFromHistory(@PathVariable Long id) {
        return "history delte with id " + id;
    }

}
