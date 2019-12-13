package com.mikasaco.dubbo.spi.ioc.spi;

public class JdkCompiler implements Compiler {
    @Override
    public void compile(String type) {
        System.out.println("JdkCompiler");
    }
}
