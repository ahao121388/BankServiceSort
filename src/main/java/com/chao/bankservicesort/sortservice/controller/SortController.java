package com.chao.bankservicesort.sortservice.controller;

import com.chao.bankservicesort.sortservice.dto.ProductDto;
import com.chao.bankservicesort.sortservice.dto.SetterLoginDto;
import com.chao.bankservicesort.sortservice.po.Atom;
import com.chao.bankservicesort.sortservice.po.Product;
import com.chao.bankservicesort.sortservice.service.SortService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/sort")
public class SortController {

    @Resource
    private SortService service;

    @RequestMapping("/login")
    public String Login(SetterLoginDto setterLoginDto){
        System.out.println("login\t" + setterLoginDto);
        return service.Login(setterLoginDto);
    }

    @RequestMapping("/productHome")
    public List<ProductDto> ProductHome(){
        return service.ProductHome();
    }

    @RequestMapping("/saveProductBascProperties")
    public Integer SaveProductBascProperties(Product product){
        System.out.println("saveProductBascProperties");
//        System.out.println(" SaveProductBascProperties\n\n\t " + service.SaveProductBascProperties(product));
        return service.SaveProductBascProperties(product);
    }

    @RequestMapping("/checkAllAtoms")
    public List<Atom> CheckAllAtoms(){
        System.out.println("checkAllAtoms");
        System.out.println(service.CheckAllAtoms());
        return service.CheckAllAtoms();
    }
}
