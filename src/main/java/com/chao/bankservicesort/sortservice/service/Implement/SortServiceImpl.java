package com.chao.bankservicesort.sortservice.service.Implement;

import com.chao.bankservicesort.sortservice.dto.SetterLoginDto;
import com.chao.bankservicesort.sortservice.mapper.SortMapper;
import com.chao.bankservicesort.sortservice.service.SortService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SortServiceImpl implements SortService {

    @Resource
    private SortMapper sortMapper;

    @Override
    public Integer Login(SetterLoginDto setterLoginDto) {
        return sortMapper.Login(setterLoginDto);
    }
}
