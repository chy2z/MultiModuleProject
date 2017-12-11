package com.chy.controller;

import com.chy.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by chy on 2017/12/6.
 */
@Controller
@RequestMapping("/default")
public class DefaultController {

    @Autowired
    HelloService helloService;

    /**
     * 测试
     * @return
     */
    @RequestMapping("/index")
    public String test() {

        System.out.println(helloService.sayHello("dubbo-consumer-web"));

        return "redirect:../../index.jsp";
    }
}
