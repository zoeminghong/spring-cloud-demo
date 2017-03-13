package com.appzone.rest.fallback;

import com.appzone.rest.api.IComputeController;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by gjason on 2017/3/11.
 */
@Component
public class ComputeClientHystrix implements IComputeController {
    @Override
    public Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b) {
        return -9999;
    }
}
