package com.mikasaco.dubbo.spi.ioc.spi;

public class JavassistCompiler implements Compiler {

    @Override
    public void compile(String type) {
        System.out.println("JavassistCompiler");
    }
}
