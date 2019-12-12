package com.mikasaco.dubbo.spi.adaptive.atmethod;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.Adaptive;
import com.alibaba.dubbo.common.extension.SPI;


@SPI("javassist")
public interface Compiler {

    /**
     * 当 @Adaptive 注解用在接口方法上时，传入参数一定要有 com.alibaba.dubbo.common.URL (也可以是传入的对象中包含 URL 对象)
     * 这么做的原因是，需要根据 URL 的参数去解析适配
     * 而 @Adaptive({"type","subType"}) 的匹配规则是：
     *      先匹配配置文件中 key 有没有等于 type 的 value的
     *      再匹配配置文件中 key 有没有等于 subType 的 value的
     *      最后只能用默认实现，本例子中就是 @SPI("javassist")
     * @param url
     */
    @Adaptive({"type","subType"})
    void compile(URL url);
}
