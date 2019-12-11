package com.mikasaco.dubbostudy.dubbo.spi.ioc;

import com.alibaba.dubbo.common.URL;

public class Man implements Person {

    private Sport sport;

    public void setSport(Sport sport) {
        this.sport = sport;
    }

    public void sayHello() {
        URL url = new URL("dubbo", "127.0.0.1", 8080);
        sport.doSport(url.addParameter("sport","running"));
        System.out.println("man say hello");
    }
}
