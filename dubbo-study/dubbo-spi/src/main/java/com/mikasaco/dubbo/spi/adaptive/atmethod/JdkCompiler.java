package com.mikasaco.dubbo.spi.adaptive.atmethod;

import com.alibaba.dubbo.common.URL;

public class JdkCompiler implements Compiler {

    @Override
    public void compile(URL url) {
        System.out.println("JdkCompiler");
    }
}
