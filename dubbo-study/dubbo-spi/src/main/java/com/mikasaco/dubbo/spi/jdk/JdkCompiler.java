package com.mikasaco.dubbo.spi.jdk;

public class JdkCompiler implements Compiler {
    public void compile() {
        System.out.println("JdkCompiler ");
    }
}
