package com.shawemou.apolloQuickStart.l2_namespace;

import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.ConfigService;

/**
 * 获取yml 的namespace的配置
 *
 * @author ：Mouxiaofei
 * @date ：Created in 2022/1/7 13:36
 * @description：
 * @modified By：
 * @version: $
 */
public class GetNameSpaceConfigYmlTest {

    /**
     * 获取命名空间下的配置
     * dev_meta: --> 等效于 dev环境的 注册中心效于注册中心
     * env: --> 环境
     * app.id --> 服务id
     * -Dapp.id=account-service -Denv=DEV -Ddev_meta=http://localhost:8080
     */
    public static void main(String[] args) throws InterruptedException {
        String namespace = "yamlTest.ymls";
        Config appConfig = ConfigService.getConfig(namespace);
        System.out.println(System.getProperty("app.id"));
        System.out.println(System.getProperty("env"));
        System.out.println(System.getProperty("dev_meta"));
        String key = "pros.nameTest";
        while (true) {
            String value = appConfig.getProperty(key, null);
            System.out.println(value);
            Thread.sleep(3000);
        }

    }
}
