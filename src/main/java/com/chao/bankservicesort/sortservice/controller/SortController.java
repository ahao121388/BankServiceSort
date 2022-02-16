package com.chao.bankservicesort.sortservice.controller;


import com.chao.bankservicesort.sortservice.dto.SetterLoginDto;
import com.chao.bankservicesort.sortservice.service.SortService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.annotation.Resource;

@CrossOrigin
@RestController
@RequestMapping("/sort")
public class SortController {

    @Resource
    private SortService service;

    @RequestMapping("/login")
    public Integer Login(SetterLoginDto setterLoginDto){
        service.Login(setterLoginDto);
        return 1;
    }
}
