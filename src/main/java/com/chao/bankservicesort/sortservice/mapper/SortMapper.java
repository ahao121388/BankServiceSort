package com.chao.bankservicesort.sortservice.mapper;

import com.chao.bankservicesort.sortservice.dto.ProductDto;
import com.chao.bankservicesort.sortservice.dto.SetterLoginDto;
import com.chao.bankservicesort.sortservice.po.Atom;
import com.chao.bankservicesort.sortservice.po.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SortMapper {
    public String Login(SetterLoginDto setterLoginDto);
    public List<ProductDto> ProductHome();
    public Integer SaveProductBascProperties(Product product);
    public List<Atom> CheckAllAtoms();
}
