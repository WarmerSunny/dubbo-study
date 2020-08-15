package com.warmer.provider.demo;

import com.warmer.common.demo.DemoService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class DemoServiceImpl implements DemoService {
    @Override
    public void printDemo() {
        System.out.println("调用dubbo-provide打印");
    }




}
