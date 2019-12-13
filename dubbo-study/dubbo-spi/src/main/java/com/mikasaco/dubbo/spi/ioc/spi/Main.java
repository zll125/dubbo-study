package com.mikasaco.dubbo.spi.ioc.spi;

import com.alibaba.dubbo.common.extension.ExtensionLoader;

/**
 * IOC扩展，使用 SPI 的方式
 * 获取 rpc 的扩展实现 dubbo，在 dubbo 中又注入了 compiler 的扩展实现
 */
public class Main {
    public static void main(String[] args) {
        ExtensionLoader<Rpc> rpcExtensionLoader = ExtensionLoader.getExtensionLoader(Rpc.class);
        Rpc dubbo = rpcExtensionLoader.getExtension("dubbo");
        dubbo.communicate();
    }

}
