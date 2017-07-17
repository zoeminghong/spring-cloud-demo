package com.appzone.order;

import com.appzone.order.dao.PartyDao;
import com.appzone.order.entity.PartyEntity;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by 迹_Jason on 2017/7/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@Transactional
public class ApplicationTest {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private PartyDao partyDao;

    @Test
    public void testRedis() throws Exception {
        // 保存字符串
//        http://blog.didispace.com/springbootredis/
        stringRedisTemplate.opsForValue().set("aaa", "111");
        Assert.assertEquals("111", stringRedisTemplate.opsForValue().get("aaa"));
    }

    @Test
    public void testMybatis(){
//        http://blog.didispace.com/mybatisinfo/
        PartyEntity partyEntity=partyDao.findById("00a972710586478ca64fedbe141ff6f9");
        Assert.assertEquals("STAFF", partyEntity.getPartyType());
    }
}
