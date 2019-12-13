package com.mikasaco.dubbo.spi.ioc.spi;

import com.alibaba.dubbo.common.extension.SPI;


@SPI("javassist")
public interface Compiler {

    void compile(String type);
}
