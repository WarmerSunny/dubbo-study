package com.warmer.consumer.demo;

import com.warmer.common.demo.DemoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {
    @DubboReference
    private DemoService demoService;

    @GetMapping("/print")
    public void print(){
        demoService.printDemo();
    }

}
