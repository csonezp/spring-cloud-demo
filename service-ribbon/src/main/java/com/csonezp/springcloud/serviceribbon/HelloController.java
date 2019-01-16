// Copyright (C) 2019 Meituan
// All rights reserved
package com.csonezp.springcloud.serviceribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangpeng34
 * Created on 2019/1/16 下午5:31
**/
@RestController
public class HelloController {
    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return helloService.hiService( name );
    }
}