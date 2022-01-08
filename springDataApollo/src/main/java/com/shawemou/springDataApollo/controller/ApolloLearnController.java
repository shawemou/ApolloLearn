package com.shawemou.springDataApollo.controller;

import com.alibaba.fastjson.JSONObject;
import com.shawemou.springDataApollo.config.ConfigProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：Mouxiaofei
 * @date ：Created in 2022/1/7 14:28
 * @description：
 * @modified By：
 * @version: $
 */
@Slf4j
@RestController()
@RequestMapping("apolloLearnController")
public class ApolloLearnController {

    @Autowired
    private ConfigProperties configProperties;

    /**
     *
     */
    @GetMapping("test")
    public String test() {
        log.info(this.configProperties.getHello());
//        log.info(this.configProperties.getNameActive());
        return JSONObject.toJSONString(this.configProperties);
    }

}
