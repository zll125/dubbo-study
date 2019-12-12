package com.mikasaco.dubbo.spi.normal;

import com.alibaba.dubbo.common.extension.ExtensionLoader;

import java.util.Iterator;
import java.util.ServiceLoader;
import java.util.Set;

/**
 * 普通扩展
 */
public class Main {
    public static void main(String[] args) {
        ExtensionLoader<Compiler> extensionLoader = ExtensionLoader.getExtensionLoader(Compiler.class);
        System.out.println("=================默认扩展=====================");
        Compiler defaultExtension = extensionLoader.getDefaultExtension();
        defaultExtension.compile();

        System.out.println("=================支持的扩展===================");
        Set<String> supportedExtensions = extensionLoader.getSupportedExtensions();
        Iterator<String> iterator = supportedExtensions.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("=================已经加载的扩展====================");
        Set<String> loadedExtensions = extensionLoader.getLoadedExtensions();
        Iterator<String> iterator1 = loadedExtensions.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

        System.out.println("=================加载Jdk扩展====================");
        Compiler jdk = extensionLoader.getExtension("jdk");
        jdk.compile();

    }
}
