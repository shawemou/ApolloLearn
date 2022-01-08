package com.shawemou.apolloQuickStart.l2_namespace;

import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.ConfigService;

/**
 * @author ：Mouxiaofei
 * @date ：Created in 2022/1/7 13:36
 * @description：
 * @modified By：
 * @version: $
 */
public class GetNameSpaceConfigTest {

    /**
     *
     * 获取命名空间下的配置
     * dev_meta: --> 等效于 dev环境的 注册中心效于注册中心
     * env: --> 环境
     * app.id --> 服务id
     * -Dapp.id=account-service -Denv=DEV -Ddev_meta=http://localhost:8080
     */
    public static void main(String[] args) throws InterruptedException {
        //命名空间 , 一定要加后缀,如果不加,默认是properties
        String namespace = "test.properties";
        Config appConfig = ConfigService.getConfig(namespace);
        System.out.println(System.getProperty("app.id"));
        System.out.println(System.getProperty("env"));
        System.out.println(System.getProperty("dev_meta"));
        String key = "hello";
        while (true) {
            String value = appConfig.getProperty(key, null);
            System.out.println(value);
            Thread.sleep(3000);
        }

    }
}
