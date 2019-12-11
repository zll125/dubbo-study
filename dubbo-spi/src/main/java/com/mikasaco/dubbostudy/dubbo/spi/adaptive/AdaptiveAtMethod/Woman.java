package com.mikasaco.dubbostudy.dubbo.spi.adaptive.AdaptiveAtMethod;

import com.alibaba.dubbo.common.URL;

public class Woman implements Person {
    public void sayHello(URL url) {
        System.out.println("woman say hello");
    }
}
