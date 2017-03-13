package com.appzone.rest.web;

import com.appzone.rest.api.IComputeController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gjason on 2017/3/11.
 */
@RestController
public class RestOrderController {
    @Autowired
    private IComputeController computeController;

    @RequestMapping(method = RequestMethod.GET, value = "/compute")
    public Integer add(@RequestParam("a") Integer a, @RequestParam("b") Integer b) {
        return computeController.add(a, b);
    }

}
