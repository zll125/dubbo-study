package com.mikasaco.dubbo.spi.normal;

public class JdkCompiler implements Compiler {
    @Override
    public void compile() {
        System.out.println("JdkCompiler");
    }
}
