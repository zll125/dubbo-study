package com.mikasaco.dubbo.spi.adaptive.atclass;

import com.alibaba.dubbo.common.extension.ExtensionLoader;

import java.util.Iterator;
import java.util.Set;

/**
 * 适配扩展，@Adaptive 注解在实现类上
 */
public class Main {
    public static void main(String[] args) {
        ExtensionLoader<Compiler> loader = ExtensionLoader.getExtensionLoader(Compiler.class);

        Compiler adaptiveExtension = loader.getAdaptiveExtension();
        adaptiveExtension.compile("jdk");
        adaptiveExtension.compile("随便写什么，都返回默认扩展实现");



    }

}
