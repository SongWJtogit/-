package com.example.sureoa.web;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.example.sureoa.dao.entity.WtjlxInfo;
import com.example.sureoa.server.WtjlxService;
import org.assertj.core.util.Maps;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/wtjlx")
public class WTJLXController {
    @Resource
    private WtjlxService wtjlxService;

//    public static HashMap<String,Double> map =new HashMap<>();
    @RequestMapping( value = "/swj")
    public List getWtj(){

        List<WtjlxInfo> wtjlxInfos  = wtjlxService.selectList(new EntityWrapper<>());
        for (WtjlxInfo wtjlxInfo:wtjlxInfos){
//                map.put(wtjlxInfo.get问题件类型(),wtjlxInfo.get序号());
         }
        return wtjlxInfos;
    }
}