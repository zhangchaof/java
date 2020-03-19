package com.learn.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @program: java:TestController
 * @description:
 * @author: clark
 * @create: 2020-03-19 10:29
 **/
@Controller
@RequestMapping("/test")
public class TestController {
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public ModelAndView index() {
       ModelAndView modelAndView = new ModelAndView("index");
       modelAndView.addObject("index","index");
       return modelAndView;
    }
}
