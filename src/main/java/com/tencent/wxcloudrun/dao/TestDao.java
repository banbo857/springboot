package com.tencent.wxcloudrun.dao;

import com.tencent.wxcloudrun.model.Test;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
public interface TestDao {
    Test getTest();
}
