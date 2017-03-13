package com.appzone.user.service.impl;

import com.appzone.user.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * Created by gjason on 2017/3/9.
 */
@Service
public class UserServiceImpl implements IUserService {
    @Override
    public String getUserNameById(String userId) {
        return "gejiaxing";
    }
}
