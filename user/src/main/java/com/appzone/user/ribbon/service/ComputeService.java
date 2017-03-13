package com.appzone.user.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by gjason on 2017/3/13.
 */
@Service
public class ComputeService {
    @Autowired
    private RestTemplate restTemplate;

    public String computeFromOrder(Integer a, Integer b) {
        // http://服务提供者的serviceId/url,返回类型不能为Integer，会报错
//        Could not read JSON: Can not deserialize instance of java.lang.Integer out of START_OBJECT token
        return this.restTemplate.getForEntity("http://ORDER-SERVICE/add?a="+a+"&b="+b, String.class).getBody();
    }
}
