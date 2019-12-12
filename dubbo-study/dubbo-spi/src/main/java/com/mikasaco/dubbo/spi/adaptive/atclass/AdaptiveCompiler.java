package com.mikasaco.dubbo.spi.adaptive.atclass;

import com.alibaba.dubbo.common.extension.Adaptive;
import com.alibaba.dubbo.common.extension.ExtensionLoader;

/**
 * 调用 ExtensionLoader.getAdaptiveExtension() 获取到这个实现类，
 * 一般会在这个类的重写方法中写适配的逻辑，比如根据参数采用不同的实现类
 *
 */
@Adaptive
public class AdaptiveCompiler implements Compiler {
    @Override
    public void compile(String type) {
        if ("jdk".equals(type)){
            Compiler jdk = ExtensionLoader.getExtensionLoader(Compiler.class).getExtension("jdk");
            jdk.compile(type);
        }else {
            Compiler compiler = ExtensionLoader.getExtensionLoader(Compiler.class).getDefaultExtension();
            compiler.compile(type);
        }
    }
}
