package com.chao.bankservicesort.sortservice.mapper;

import com.chao.bankservicesort.sortservice.dto.SetterLoginDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SortMapper {
    public Integer Login(SetterLoginDto setterLoginDto);
}
