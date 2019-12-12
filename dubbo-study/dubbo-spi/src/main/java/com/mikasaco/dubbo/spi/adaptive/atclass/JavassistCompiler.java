package com.mikasaco.dubbo.spi.adaptive.atclass;

public class JavassistCompiler implements Compiler {
    @Override
    public void compile(String type) {
        System.out.println("JavassistCompiler");
    }
}
