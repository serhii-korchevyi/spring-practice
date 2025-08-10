package com.springpractice.springpractice.controller;

import com.springpractice.springpractice.entity.History;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import justfordemo.JustForDemo;
import com.springpractice.springpractice.service.HistoryService;
import justfordemo.JustForDemo1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public List<History> getHistory() {
        return this.historyService.getHistoryList();
    }

    @PostMapping("history/add-action")
    public String addActionToHistory() {
        this.historyService.addActionToHistory();
        return "history create";
    }

    @PutMapping("history/update-action/{actionId}")
    public void updateActionInHistory(@PathVariable int actionId) {
        this.historyService.historyActionUpdate(actionId);
    }

    @DeleteMapping("/history/delete/{actionId}")
    public void deleteActionFromHistory(@PathVariable int actionId) {
        this.historyService.historyActionDelete(actionId);
    }

}
