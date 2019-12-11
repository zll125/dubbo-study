package com.mikasaco.dubbostudy.dubbo.spi.basic;

import com.alibaba.dubbo.common.extension.ExtensionLoader;

public class DubboSpiTest {
    public static void main(String[] args) {
        ExtensionLoader<Person> extensionLoader = ExtensionLoader.getExtensionLoader(Person.class);
        Person defaultExtension = extensionLoader.getDefaultExtension();
        defaultExtension.sayHello();
        Person woman = extensionLoader.getExtension("woman");
        woman.sayHello();


    }
}
