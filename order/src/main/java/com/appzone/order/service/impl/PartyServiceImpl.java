package com.appzone.order.service.impl;

import com.appzone.order.dao.PartyDao;
import com.appzone.order.entity.PartyEntity;
import com.appzone.order.service.PartyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * Created by gjason on 2017/3/9.
 */
@Service
@CacheConfig(cacheNames = "party")
public class PartyServiceImpl implements PartyService {

    @Autowired
    private PartyDao partyDao;

    //http://blog.didispace.com/springbootcache2/
    @Override
    @Cacheable(key = "#p0") //参数partyId
    public PartyEntity getParty(String partyId) {
        return partyDao.findById(partyId);
    }
}
