package com.mikasaco.dubbostudy.dubbo.spi.adaptive.AdaptiveAtMethod;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.ExtensionLoader;

public class AdaptiveAtClassTest {
    public static void main(String[] args) {
        ExtensionLoader<Person> loader = ExtensionLoader.getExtensionLoader(Person.class);
        Person person = loader.getAdaptiveExtension();
        URL url = new URL("dubbo", "127.0.0.1", 8080);
        person.sayHello(url);

    }
}
