package com.appzone.rest.api;

import com.appzone.rest.fallback.ComputeClientHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by gjason on 2017/3/9.
 */
//一个客户端，feign自带断路器
@FeignClient(value = "order-service", fallback = ComputeClientHystrix.class)
public interface IComputeController {

    @RequestMapping(method = RequestMethod.GET, value = "/add")
    public Integer add(@RequestParam("a") Integer a, @RequestParam("b") Integer b);

}
