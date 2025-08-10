package com.springpractice.springpractice.controller;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import justfordemo.JustForDemo;
import com.springpractice.springpractice.service.HistoryService;
import justfordemo.JustForDemo1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.*;

@RestController
public class HistoryController {

    private final HistoryService historyService;
    private JustForDemo justForDemo;

    @Autowired
    private JustForDemo1 justForDemo1;

    //Constructor injection
    @Autowired
    public HistoryController(HistoryService historyService) {
        this.historyService = historyService;
    }

    //Setter lazy qualifier injection of justForDemo2 class from directory which out of scene
    @Autowired //Qualifier priority is higher than primary
    @Lazy
    public void setJustForDemo(@Qualifier("justForDemo2") JustForDemo justForDemo) {
        this.justForDemo = justForDemo;
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("postConstruct");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("preDestroy");
    }

    @GetMapping("/demo-method1")
    public String getDemoMethod1() {
        return this.justForDemo1.getDemoText();
    }

    @GetMapping("/demo-method2")
    public String getDemoMethod2() {
        return this.justForDemo.getDemoText();
    }


    @GetMapping("/history")
    public String getHistory() {
        return this.historyService.getHistory();
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
