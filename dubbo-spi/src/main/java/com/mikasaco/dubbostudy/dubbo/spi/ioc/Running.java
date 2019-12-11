package com.mikasaco.dubbostudy.dubbo.spi.ioc;

import com.alibaba.dubbo.common.URL;

public class Running implements Sport {

    public void doSport(URL url) {
        System.out.println(" running ");
    }
}
