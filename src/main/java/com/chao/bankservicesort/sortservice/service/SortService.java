package com.chao.bankservicesort.sortservice.service;


import com.chao.bankservicesort.sortservice.dto.ProductDto;
import com.chao.bankservicesort.sortservice.dto.SetterLoginDto;
import com.chao.bankservicesort.sortservice.po.Atom;
import com.chao.bankservicesort.sortservice.po.Product;

import java.util.List;

public interface SortService {
    public String Login(SetterLoginDto setterLoginDto);
    public List<ProductDto> ProductHome();
    public Integer SaveProductBascProperties(Product product);
    public List<Atom> CheckAllAtoms();
}
