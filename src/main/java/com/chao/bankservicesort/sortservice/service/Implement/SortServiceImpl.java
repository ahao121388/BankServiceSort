package com.chao.bankservicesort.sortservice.service.Implement;

import com.chao.bankservicesort.sortservice.dto.ProductDto;
import com.chao.bankservicesort.sortservice.dto.SetterLoginDto;
import com.chao.bankservicesort.sortservice.mapper.SortMapper;
import com.chao.bankservicesort.sortservice.po.Atom;
import com.chao.bankservicesort.sortservice.po.Product;
import com.chao.bankservicesort.sortservice.service.SortService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SortServiceImpl implements SortService {

    @Resource
    private SortMapper sortMapper;

    @Override
    public String Login(SetterLoginDto setterLoginDto) {
        return sortMapper.Login(setterLoginDto);
    }

    @Override
    public List<ProductDto> ProductHome() {
        return sortMapper.ProductHome();
    }

    @Override
    public Integer SaveProductBascProperties(Product product) {
        return sortMapper.SaveProductBascProperties(product);
    }

    @Override
    public List<Atom> CheckAllAtoms() {
        return sortMapper.CheckAllAtoms();
    }
}
