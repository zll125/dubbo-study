package com.mikasaco.dubbo.spi.normal;

public class JavassistCompiler implements Compiler {
    @Override
    public void compile() {
        System.out.println("JavassistCompiler");
    }
}
