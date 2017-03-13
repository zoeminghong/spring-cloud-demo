package com.appzone.order.service.impl;

import com.appzone.order.service.IComputeService;
import org.springframework.stereotype.Service;

/**
 * Created by gjason on 2017/3/9.
 */
@Service
public class ComputeServiceImpl implements IComputeService {

    @Override
    public int compute(int a, int b) {
        return a + b;
    }
}
