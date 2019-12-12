package com.mikasaco.dubbo.spi.adaptive.atclass;

public class JdkCompiler implements Compiler {
    @Override
    public void compile(String type) {
        System.out.println("JdkCompiler");
    }
}
