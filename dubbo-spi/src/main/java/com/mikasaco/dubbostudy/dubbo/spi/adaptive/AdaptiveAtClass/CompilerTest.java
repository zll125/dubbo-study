package com.mikasaco.dubbostudy.dubbo.spi.adaptive.AdaptiveAtClass;

import com.alibaba.dubbo.common.extension.ExtensionLoader;

public class CompilerTest {

    public static void main(String[] args) {
        ExtensionLoader<Compiler> loader = ExtensionLoader.getExtensionLoader(Compiler.class);
        Compiler adaptiveExtension = loader.getAdaptiveExtension();
        adaptiveExtension.compile();
    }
}
