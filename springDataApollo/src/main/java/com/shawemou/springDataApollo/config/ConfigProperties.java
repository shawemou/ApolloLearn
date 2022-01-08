package com.shawemou.springDataApollo.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author ：Mouxiaofei
 * @date ：Created in 2022/1/7 14:57
 * @description：
 * @modified By：
 * @version: $
 */
@Data
@Component
public class ConfigProperties {

//    @Value("${name.active}")
//    private String nameActive;

    @Value("${hello}")
    private String hello;

    @Value("${pros.nameTest}")
    private String nameTest;
};
