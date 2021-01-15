package com.example.demo.mapper;

import com.example.demo.entity.BsSystemconfig;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface SystemconfigMapper extends tk.mybatis.mapper.common.Mapper<BsSystemconfig> {
    List<BsSystemconfig> selectLastMinuteUpdateSystemConfigList();
}
