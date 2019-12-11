package com.mikasaco.dubbostudy.dubbo.spi.ioc;

import com.alibaba.dubbo.common.extension.ExtensionLoader;

public class SpiIocTest {

    public static void main(String[] args) {
        ExtensionLoader<Person> extensionLoader = ExtensionLoader.getExtensionLoader(Person.class);
        Person man = extensionLoader.getExtension("man");
        man.sayHello();
    }
}
