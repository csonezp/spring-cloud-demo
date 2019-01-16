// Copyright (C) 2019 Meituan
// All rights reserved
package com.csonezp.springcloud.servicefeign;

import org.springframework.stereotype.Component;

/**
 * @author zhangpeng34
 * Created on 2019/1/16 下午8:38
**/
@Component
public class SchedualServiceHiFallBack implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "hi!this is error!";
    }
}