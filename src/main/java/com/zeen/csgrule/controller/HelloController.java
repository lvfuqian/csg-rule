package com.zeen.csgrule.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 泰民
 * @title: HelloController
 * @projectName csg-rule
 * @description: TODO
 * @date 2019/6/1215:32
 */
@RestController
public class HelloController {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String sayHello(){
        String hello="return hello taemin";

        return hello;
    }


}
