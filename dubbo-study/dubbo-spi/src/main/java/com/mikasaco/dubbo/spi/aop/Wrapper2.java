package com.mikasaco.dubbo.spi.aop;

public class Wrapper2 implements Compiler {


    private Compiler compiler;


    public Wrapper2(Compiler compiler){
        this.compiler=compiler;
    }
    @Override
    public void compile() {
        System.out.println("Wrapper2 compile before");
        compiler.compile();
        System.out.println("Wrapper2 compile after");

    }
}
