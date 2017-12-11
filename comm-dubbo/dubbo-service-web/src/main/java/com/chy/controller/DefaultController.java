package com.chy.controller;

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

        return "redirect:../../index.jsp";
    }
}
