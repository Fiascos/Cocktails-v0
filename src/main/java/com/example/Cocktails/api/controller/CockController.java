package com.example.Cocktails.api.controller;

import com.example.Cocktails.api.model.Cock;
import com.example.Cocktails.service.CockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class CockController {


    private CockService cockService;

    @Autowired
    public CockController(CockService cockService) {this.cockService = cockService;}

    @GetMapping("/cocktail")
    public Cock getCock(@RequestParam Integer id) {
        Optional<Cock> cock = cockService.getCock(id);
        if (cock.isPresent()){
            return (Cock) cock.get();
        }
        return null;
    }
}
