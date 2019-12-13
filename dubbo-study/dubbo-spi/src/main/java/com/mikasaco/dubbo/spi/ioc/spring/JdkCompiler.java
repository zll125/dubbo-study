package com.mikasaco.dubbo.spi.ioc.spring;

public class JdkCompiler implements Compiler {
    @Override
    public void compile() {
        System.out.println("JdkCompiler");
    }
}
