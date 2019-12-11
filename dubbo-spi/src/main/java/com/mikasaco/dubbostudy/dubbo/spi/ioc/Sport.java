package com.mikasaco.dubbostudy.dubbo.spi.ioc;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.Adaptive;
import com.alibaba.dubbo.common.extension.SPI;

@SPI
public interface Sport {
    @Adaptive
    void doSport(URL url);
}
