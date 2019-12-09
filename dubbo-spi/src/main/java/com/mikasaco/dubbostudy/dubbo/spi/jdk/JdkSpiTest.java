package com.mikasaco.dubbostudy.dubbo.spi.jdk;

import java.util.Iterator;
import java.util.ServiceLoader;

public class JdkSpiTest {
    public static void main(String[] args) {
        ServiceLoader<Person> load = ServiceLoader.load(Person.class);
        Iterator<Person> iterator = load.iterator();
        while (iterator.hasNext()){
            Person next = iterator.next();
            next.sayHello();
        }
    }
}
