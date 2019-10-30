package com.ciec.prepaid.biz.service.impl;

import com.ciec.prepaid.biz.service.DemoService;
import com.ciec.prepaid.dao.entity.PrepaidUser;
import com.ciec.prepaid.dao.mapper.PrepaidUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements  DemoService {

   @Autowired
    private PrepaidUserMapper prepaidUserMapper;

    @Override
    public String savePrepaidUser(PrepaidUser prepaidUser) {

      return prepaidUserMapper.insert(prepaidUser) + "";
    }
}
