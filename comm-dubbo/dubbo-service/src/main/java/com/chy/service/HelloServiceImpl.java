package com.chy.service;

import org.springframework.stereotype.Service;

/**
 * Created by chy on 2017/12/8.
 */
@Service("helloService")
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String str) {
        return "jar-Hello " + str;
    }

}
