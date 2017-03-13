package com.appzone.order.web;

import com.appzone.order.service.IComputeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

/**
 * Created by gjason on 2017/3/9.
 */
@RestController
@RefreshScope//刷新配置数据
public class ComputeController {
    private static final Logger logger = Logger.getLogger(ComputeController.class.getName());
    @Autowired
    private IComputeService computeService;
    @Value("${from}")
    private String from;

    @RequestMapping(method = RequestMethod.GET, value = "/add")
    public Integer add(@RequestParam("a") Integer a, @RequestParam("b") Integer b) {
        logger.info("申请收到");
        logger.info("from:" + this.from);
        return computeService.compute(a, b);
    }
    public void setFrom(String from) {
        this.from = from;
    }

    public String getFrom() {
        return from;
    }
}
