package com.mikasaco.dubbo.spi.ioc.spi;

import com.alibaba.dubbo.common.extension.SPI;

@SPI
public interface Rpc {

    void communicate();
}
