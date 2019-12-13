package com.mikasaco.dubbo.spi.ioc.spi;

import com.alibaba.dubbo.common.extension.Adaptive;
import com.alibaba.dubbo.common.extension.ExtensionLoader;

/**
 * IOC-SPI 的扩展方式，注入的扩展一定要是适配扩展的方式,原因在 SpiExtensionFactory 中
 */
@Adaptive
public class AdaptiveCompiler implements Compiler {
    @Override
    public void compile(String type) {
        if ("jdk".equals(type)){
            Compiler jdk = ExtensionLoader.getExtensionLoader(Compiler.class).getExtension("jdk");
            jdk.compile(type);
        }else {
            Compiler compiler = ExtensionLoader.getExtensionLoader(Compiler.class).getDefaultExtension();
            compiler.compile(type);
        }
    }
}
