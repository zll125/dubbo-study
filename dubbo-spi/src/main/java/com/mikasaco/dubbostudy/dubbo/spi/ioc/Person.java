package com.mikasaco.dubbostudy.dubbo.spi.ioc;

import com.alibaba.dubbo.common.extension.SPI;

@SPI
public interface Person {

    void sayHello();
}
