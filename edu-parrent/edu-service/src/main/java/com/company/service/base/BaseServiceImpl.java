package com.company.service.base;

import com.company.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author kaichenkai
 * @date 2020-08-15 16:55
 */
public abstract class BaseServiceImpl<T> implements IBaseService<T> {
    //统一管理dao
    @Autowired
    protected UserMapper userMapper;
}
