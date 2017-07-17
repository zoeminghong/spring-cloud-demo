package com.appzone.order.web;

import com.appzone.order.entity.PartyEntity;
import com.appzone.order.service.PartyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

/**
 * Created by gjason on 2017/3/9.
 */
@RestController
@RefreshScope//刷新配置数据
@RequestMapping("party")
public class PartyController {
    private static final Logger logger = Logger.getLogger(PartyController.class.getName());
    @Autowired
    private PartyService partyService;

    @GetMapping("/{partyId}")
    public PartyEntity getPartyInfo(@PathVariable String partyId) {
        return partyService.getParty(partyId);
    }
}
