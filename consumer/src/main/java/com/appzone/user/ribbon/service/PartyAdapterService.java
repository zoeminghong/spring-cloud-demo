package com.appzone.user.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;


/**
 * Created by gjason on 2017/3/13.
 */
@Service
public class PartyAdapterService {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallback")//服务降级
    public String queryParty(String partyId) {
        // http://服务提供者的serviceId/url,返回类型不能为Integer，会报错
//        Could not read JSON: Can not deserialize instance of java.lang.Integer out of START_OBJECT token
        Map<String, Object> pathParams = new HashMap<>();
        pathParams.put("partyId", partyId);
        return this.restTemplate.getForEntity("http://ORDER-SERVICE/party/{partyId}", String.class, pathParams).getBody();
    }

    public String fallback() {
        return "fallback";
    }
}
