package com.mikasaco.dubbo.spi.jdk;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * JDK SPI
 */
public class Main {
    public static void main(String[] args) {
        ServiceLoader<Compiler> load = ServiceLoader.load(Compiler.class);
        Iterator<Compiler> iterator = load.iterator();
        while (iterator.hasNext()){
            Compiler next = iterator.next();
            next.compile();
        }

    }
}
