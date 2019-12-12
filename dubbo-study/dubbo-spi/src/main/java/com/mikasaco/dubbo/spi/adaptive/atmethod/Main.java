package com.mikasaco.dubbo.spi.adaptive.atmethod;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.ExtensionLoader;

/**
 * 适配扩展，@Adaptive 注解在接口方法上
 */
public class Main {
    public static void main(String[] args) {
        ExtensionLoader<Compiler> loader = ExtensionLoader.getExtensionLoader(Compiler.class);

        Compiler adaptiveExtension = loader.getAdaptiveExtension();
        URL url = new URL("协议", "ip", 8080);
        url.addParameter("type","jdk"); // url参数: type=jdk
        adaptiveExtension.compile(url);
        url.addParameter("subType","javassist"); // url参数: type=jdk&subType=javassist
        adaptiveExtension.compile(url);
        URL url1 = new URL("协议", "ip", 8080);
        url1.addParameter("随便写什么","都是默认扩展实现"); //url参数: 随便写什么=都是默认扩展实现
        adaptiveExtension.compile(url1);
    }

}
