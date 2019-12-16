package com.mikasaco.dubbo.spi.aop;

/**
 * AOP 扩展的使用，需要在装饰器中定义构造方法，传入参数为扩展接口，然后在重写的方法中做增强(代码16，18行就是增强的内容)
 *
 */
public class Wrapper1 implements Compiler {

    private Compiler compiler;

    public Wrapper1(Compiler compiler){
        this.compiler=compiler;
    }

    @Override
    public void compile() {
        System.out.println("Wrapper1 compile before");
        compiler.compile();
        System.out.println("Wrapper1 compile after");

    }
}
