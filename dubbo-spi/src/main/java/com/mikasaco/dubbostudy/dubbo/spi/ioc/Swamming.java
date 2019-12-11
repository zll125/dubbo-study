package com.mikasaco.dubbostudy.dubbo.spi.ioc;

import com.alibaba.dubbo.common.URL;

public class Swamming implements Sport {

    public void doSport(URL url) {
        System.out.println(" swamming ");
    }
}
