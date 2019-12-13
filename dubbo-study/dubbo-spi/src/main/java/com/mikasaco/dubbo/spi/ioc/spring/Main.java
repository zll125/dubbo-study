package com.mikasaco.dubbo.spi.ioc.spring;

import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.alibaba.dubbo.config.spring.extension.SpringExtensionFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * IOC扩展，使用 spring 的方式
 * 获取 rpc 的扩展实现 dubbo，在 dubbo 中又注入了 compiler 的扩展实现
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        // 把 spring 容器关联到 dubbo 中
        SpringExtensionFactory.addApplicationContext(applicationContext);

        ExtensionLoader<Rpc> rpcExtensionLoader = ExtensionLoader.getExtensionLoader(Rpc.class);
        Rpc dubbo = rpcExtensionLoader.getExtension("dubbo");
        dubbo.communicate();
    }

}
