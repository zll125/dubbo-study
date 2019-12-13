package com.mikasaco.dubbo.spi.ioc.spi;

import com.alibaba.dubbo.common.extension.DisableInject;

/**
 * 当使用 @DisableInject 注解时，就不会注入这个 set 方法
 */
public class SpringCloud implements Rpc {

    private Compiler compiler;

    @DisableInject
    public void setCompiler(Compiler compiler) {
        this.compiler = compiler;
    }


    @Override
    public void communicate() {
        System.out.println("spring cloud");
    }
}
