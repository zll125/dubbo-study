package com.mikasaco.dubbostudy.dubbo.spi.adaptive.AdaptiveAtClass;

import com.alibaba.dubbo.common.extension.SPI;

@SPI("javassist")
public interface Compiler {

    void compile();
}
