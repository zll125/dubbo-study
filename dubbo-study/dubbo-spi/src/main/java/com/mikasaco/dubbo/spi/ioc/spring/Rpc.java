package com.mikasaco.dubbo.spi.ioc.spring;

import com.alibaba.dubbo.common.extension.SPI;

@SPI
public interface Rpc {

    void communicate();
}
