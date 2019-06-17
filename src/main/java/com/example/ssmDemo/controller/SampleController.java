package com.example.ssmDemo.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*
@description: 这个人很懒，什么都没有留下....
@author: Pierre Fan
@create: 2019-03-11 17:21
*/
@Controller
@EnableAutoConfiguration
public class SampleController {

    @RequestMapping("/")
    @ResponseBody
    public String home(){

        return "hello Word!";

    }

}
