package com.chy.Task;

import com.chy.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by chy on 2017/12/8.
 */
@Component
public class Task {

    @Autowired
    HelloService helloService;

    @Scheduled(cron = "*/5 * * * * ?")
    public void print(){
        System.out.println( helloService.sayHello("dubbo-consumer-web"));
    }
}
