package com.mikasaco.dubbostudy.dubbo.spi.adaptive.AdaptiveAtMethod;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.Adaptive;
import com.alibaba.dubbo.common.extension.SPI;

@SPI("man")
public interface Person {

    @Adaptive({"woman","abs","iii","fefe"})
    void sayHello(URL url);
}
