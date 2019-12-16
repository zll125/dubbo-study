package com.mikasaco.dubbo.spi.aop;

/**
 * 普通的扩展实现类，并不需要做任务处理，体现了 AOP 对原有代码的无侵入
 */
public class JavassistCompiler implements Compiler {

    @Override
    public void compile() {
        System.out.println("JavassistCompiler");
    }
}
