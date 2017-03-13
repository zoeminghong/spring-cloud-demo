package com.appzone.user.web;

import com.appzone.user.ribbon.service.ComputeService;
import com.appzone.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.QueryParam;
import java.util.logging.Logger;

/**
 * Created by gjason on 2017/3/9.
 */
@RestController
public class UserController {
    Logger logger = Logger.getLogger(UserController.class.getName());
    @Autowired
    private IUserService userService;
    @Autowired
    private ComputeService computeService;

    @RequestMapping(method = RequestMethod.GET, value = "/user")
    public String getUserNameById(@QueryParam("userId") String userId) {
        String sum = computeService.computeFromOrder(1, 1);
        logger.info("结果："+sum);
        return userService.getUserNameById(userId);
    }
}
