package com.ping.service.impl;

import com.ping.service.HelloService;
import com.ping.service.TestService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    //远程引用指定的服务，他会按照全类名进行匹配，看谁给注册中心注册了这个全类名
    @Reference
    private HelloService helloService;

    @Override
    public void test() {
        String a = helloService.sayHello("aaa");
        System.out.println(a);
    }
}
