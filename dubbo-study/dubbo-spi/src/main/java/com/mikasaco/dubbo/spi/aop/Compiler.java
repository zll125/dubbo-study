package com.mikasaco.dubbo.spi.aop;

import com.alibaba.dubbo.common.extension.SPI;

@SPI("javassist")
public interface Compiler {

    void compile();
}
