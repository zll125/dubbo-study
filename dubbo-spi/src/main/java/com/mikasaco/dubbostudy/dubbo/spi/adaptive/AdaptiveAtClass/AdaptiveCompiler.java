package com.mikasaco.dubbostudy.dubbo.spi.adaptive.AdaptiveAtClass;

import com.alibaba.dubbo.common.extension.Adaptive;
import com.alibaba.dubbo.common.extension.ExtensionLoader;

@Adaptive
public class AdaptiveCompiler implements Compiler {

    private String compiler;

    public void setCompiler(String compiler) {
        this.compiler = compiler;
    }

    public void compile() {
        System.out.println("AdaptiveCompiler");
        if (compiler == null) {
            Compiler defaultExtension = ExtensionLoader.getExtensionLoader(Compiler.class).getDefaultExtension();
            defaultExtension.compile();
        } else {
            Compiler compiler = ExtensionLoader.getExtensionLoader(Compiler.class).getExtension(this.compiler);
            compiler.compile();
        }
    }
}
