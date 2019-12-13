package com.mikasaco.dubbo.spi.ioc.spring;

public class Dubbo implements Rpc {

    private Compiler compiler;

    /**
     * 使用 IOC-spring 的方式会，先根据 setXXX 中的 XXX 去 ApplicationContext 容器中匹配 bean name 获取扩展实现；
     *                             没有找到再根据 Class 类型去匹配
     * 这个例子中就是获取 spring 容器中，bean 名称为 jdkCompiler
     * @param compiler
     */
    public void setJdkCompiler(Compiler compiler) {
        this.compiler = compiler;
    }

    @Override
    public void communicate() {
        System.out.println("dubbo");
        compiler.compile();
    }
}
