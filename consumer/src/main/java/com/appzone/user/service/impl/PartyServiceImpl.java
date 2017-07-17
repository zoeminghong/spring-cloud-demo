package com.appzone.user.service.impl;

import com.appzone.user.ribbon.service.PartyAdapterService;
import com.appzone.user.service.PartyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by gjason on 2017/3/9.
 */
@Service
public class PartyServiceImpl implements PartyService {
    @Autowired
    private PartyAdapterService partyAdapterService;
    @Override
    public String findPartyByPartyId(String partyId) {
        return partyAdapterService.queryParty(partyId);
    }

}
