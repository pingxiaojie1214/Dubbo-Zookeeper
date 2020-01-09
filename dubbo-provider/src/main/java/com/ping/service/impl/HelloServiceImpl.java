package com.ping.service.impl;


import com.ping.service.HelloService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;
//依赖注入,使用了dubbo后尽量不要用@Service注解
@Component
//将服务发布出去,项目一启动就自动注册到注册中心
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
