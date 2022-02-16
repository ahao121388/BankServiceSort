package com.chao.bankservicesort.sortservice.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/sort")
public class SortController {
    @RequestMapping("/login")
    public Integer Login(){
        System.out.println("login -- ing");
        return 1;
    }
}
