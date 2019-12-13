package com.mikasaco.dubbo.spi.ioc.spring;

public class JavassistCompiler implements Compiler {

    @Override
    public void compile() {
        System.out.println("JavassistCompiler");
    }
}
