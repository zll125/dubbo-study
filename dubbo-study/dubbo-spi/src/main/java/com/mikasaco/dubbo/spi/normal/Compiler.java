package com.mikasaco.dubbo.spi.normal;

import com.alibaba.dubbo.common.extension.SPI;

/**
 * @SPI 标注这个接口是可扩展的，然后就会找配置文件中这个接口的全限定名的文件
 * @SPI("javassist") 其中 javassist 是这个接口的默认扩展实现，调用 extensionLoader.getDefaultExtension() 会返回默认扩展实现类
 */
@SPI("javassist")
public interface Compiler {

    void compile();
}
