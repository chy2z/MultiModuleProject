package com.chy.springmvc.controller;

import cn.chy.DateTimeUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by chy on 2017/12/6.
 */
@Controller
@RequestMapping("/default")
public class DefaultController {

    /**
     * 测试
     * @return
     */
    @RequestMapping("/index")
    public String test() {

        System.out.println("当前时间:"+DateTimeUtil.time("yyyy-MM-dd HH:mm"));

        return "redirect:../../index.jsp";
    }
}
