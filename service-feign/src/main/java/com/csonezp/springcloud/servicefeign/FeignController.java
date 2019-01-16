// Copyright (C) 2019 Meituan
// All rights reserved
package com.csonezp.springcloud.servicefeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangpeng34
 * Created on 2019/1/16 下午8:28
**/
@RestController
public class FeignController {
    @Autowired
    SchedualServiceHi schedualServiceHi;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return schedualServiceHi.sayHiFromClientOne( name )+" feign";
    }
}