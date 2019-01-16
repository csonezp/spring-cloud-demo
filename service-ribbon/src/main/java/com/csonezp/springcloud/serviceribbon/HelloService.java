// Copyright (C) 2019 Meituan
// All rights reserved
package com.csonezp.springcloud.serviceribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhangpeng34
 * Created on 2019/1/16 下午5:30
**/
@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;

    public String hiService(String name) {
        return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class)+" ribbon";
    }
}