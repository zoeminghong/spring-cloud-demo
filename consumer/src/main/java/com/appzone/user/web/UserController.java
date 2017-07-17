package com.appzone.user.web;

import com.appzone.user.service.PartyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

/**
 * Created by gjason on 2017/3/9.
 */
@RestController
@RequestMapping("user")
public class UserController {
    Logger logger = Logger.getLogger(UserController.class.getName());
    @Autowired
    private PartyService userService;

    @GetMapping("{partyId}")
    public String getUserNameById(@PathVariable String partyId) {
        return userService.findPartyByPartyId(partyId);
    }
}
