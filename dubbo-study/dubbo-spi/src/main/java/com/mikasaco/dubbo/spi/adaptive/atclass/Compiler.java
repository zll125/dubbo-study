package com.mikasaco.dubbo.spi.adaptive.atclass;

import com.alibaba.dubbo.common.extension.SPI;

/**
 * 这里这个接口的默认扩展实现类还是 javassist,当调用 extensionLoader.getDefaultExtension() 会返回 javassist 对应的扩展类
 * 注意 ExtensionLoader.getAdaptiveExtension() 返回的是实现类上注解了 @Adaptive 的类
 */
@SPI("javassist")
public interface Compiler {

    void compile(String type);
}
