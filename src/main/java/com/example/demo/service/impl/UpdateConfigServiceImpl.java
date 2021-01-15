package com.example.demo.service.impl;

import com.example.demo.entity.BsDicdetail;
import com.example.demo.entity.BsSystemconfig;
import com.example.demo.mapper.DicDetailMapper;
import com.example.demo.mapper.SystemconfigMapper;
import com.example.demo.service.UpdateConfigService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Service
public class UpdateConfigServiceImpl implements UpdateConfigService {
    private  Logger log = LoggerFactory.getLogger(UpdateConfigServiceImpl.class);

    @Autowired
    private SystemconfigMapper systemconfigMapper;

    @Autowired
    private DicDetailMapper dicDetailMapper;

    @Override
    public String updateConfig() {
        StringBuilder contentBuilder= new StringBuilder();
        List<BsSystemconfig> bsSystemconfigList = systemconfigMapper.selectLastMinuteUpdateSystemConfigList();
        List<BsDicdetail> bsDicdetailList = dicDetailMapper.selectLastMinuteUpdateDicDetailList();

        if(!CollectionUtils.isEmpty(bsSystemconfigList)){
            for (BsSystemconfig n:bsSystemconfigList) {
                contentBuilder.append(n.getUpdateUser())
                        .append("将")
                        .append(n.getDescription())
                        .append("修改为：" )
                        .append(n.getCfgKey())
                        .append("=")
                        .append(n.getValue())
                        .append("\r\n");
//                content += n.getUpdateUser() + "将配置" + n.getCfgKey() + "修改为：" + n.getValue() +"/r/n";
            }
        }
        if(!CollectionUtils.isEmpty(bsDicdetailList)){
            for (BsDicdetail n:bsDicdetailList) {
                contentBuilder.append(n.getUpdateUser())
                        .append("将")
                        .append(n.getDicdetailName())
                        .append("修改为：" )
                        .append(n.getCodeType())
                        .append("=")
                        .append(n.getValue())
                        .append("\r\n");
//                content += n.getUpdateUser() + "将配置" + n.getCodeType() + "修改为：" + n.getValue() +"/r/n";
            }
        }
        log.info("返回结果：{}", contentBuilder.toString());
        return contentBuilder.toString();
    }
}
