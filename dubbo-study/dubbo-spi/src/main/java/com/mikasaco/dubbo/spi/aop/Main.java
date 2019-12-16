package com.mikasaco.dubbo.spi.aop;

import com.alibaba.dubbo.common.extension.ExtensionLoader;

import java.util.Iterator;
import java.util.Set;

/**
 * AOP 扩展，这里执行结果和配置文件中 wrapper1 和 warpper2 的顺序有关，具体分析参考博客 http://www.shenlinqiang.com/2019/12/10/Dubbo-扩展点SPI/
 *
 */
public class Main {
    public static void main(String[] args) {
        ExtensionLoader<Compiler> extensionLoader = ExtensionLoader.getExtensionLoader(Compiler.class);
        Compiler defaultExtension = extensionLoader.getDefaultExtension();
        defaultExtension.compile();

    }
}
