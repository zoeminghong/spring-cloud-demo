package com.appzone.rest;

import com.appzone.rest.filter.AccessFilter;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * Created by gjason on 2017/3/11.
 */
@EnableZuulProxy
@SpringCloudApplication
@EnableFeignClients
public class RestApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(RestApplication.class).web(true).run(args);
    }
    @Bean
    public AccessFilter accessFilter() {
        return new AccessFilter();
    }
}
