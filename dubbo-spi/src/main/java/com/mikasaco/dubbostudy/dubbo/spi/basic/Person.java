package com.mikasaco.dubbostudy.dubbo.spi.basic;

import com.alibaba.dubbo.common.extension.SPI;

@SPI("man")
public interface Person {
    void sayHello();
}
