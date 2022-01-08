package com.shawemou.apolloQuickStart.l1_base;

import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.ConfigService;

/**
 * @author ：Mouxiaofei
 * @date ：Created in 2022/1/7 11:17
 * @description：
 * @modified By：
 * @version: $
 */
public class GetConfigTest {

    /**
     * dev_meta: --> 等效于 dev环境的 注册中心
     * env: --> 环境
     * app.id --> 服务id
     * apollo.cluster=集群名称
     * -Dapp.id=apollo-quickstart -Denv=DEV -Ddev_meta=http://localhost:8080
     */
    public static void main(String[] args) throws InterruptedException {
        System.out.println(System.getProperty("app.id"));
        System.out.println(System.getProperty("env"));
        System.out.println(System.getProperty("dev_meta"));
        Config appConfig = ConfigService.getAppConfig();
        String key = "sms.enable";
        while (true) {
            Thread.sleep(3000);
            String value = appConfig.getProperty(key, null);
            System.out.println(value);
        }
    }
}
