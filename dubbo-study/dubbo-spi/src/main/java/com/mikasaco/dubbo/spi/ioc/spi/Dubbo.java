package com.mikasaco.dubbo.spi.ioc.spi;

public class Dubbo implements Rpc {

    private Compiler compiler;

    /**
     * 在使用 IOC-SPI 的扩展方式时， setXXX(Class c) 这里重要的是 Class 这个接口的类型；
     * IOC-SPI 扩展方式会根据注入的类型去获取适配实现，所以注入的一定要是适配扩展；
     * 如果使用 IOC-spring 的方式会，先根据 setXXX 中的 XXX 去 ApplicationContext 容器中匹配 bean name 获取扩展实现；
     *                             没有找到再根据 Class 类型去匹配
     * @param compiler
     */
    public void setCompiler(Compiler compiler) {
        this.compiler = compiler;
    }

    @Override
    public void communicate() {
        System.out.println("dubbo");
        compiler.compile("jdk");
    }
}
