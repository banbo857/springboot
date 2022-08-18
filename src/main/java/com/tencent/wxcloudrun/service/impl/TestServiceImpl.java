package com.tencent.wxcloudrun.service.impl;

import com.tencent.wxcloudrun.dao.TestDao;
import com.tencent.wxcloudrun.model.Test;
import com.tencent.wxcloudrun.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestDao testDao;

    @Override
    public Test getTest() {
        return testDao.getTest();
    }
}
