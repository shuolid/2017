package com.example.demo.mapper;

import com.example.demo.entity.BsDicdetail;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface DicDetailMapper extends tk.mybatis.mapper.common.Mapper<BsDicdetail> {
    List<BsDicdetail> selectLastMinuteUpdateDicDetailList();

    void packageSwitch(Integer packageSwitch);
}
