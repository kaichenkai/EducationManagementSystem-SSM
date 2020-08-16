package com.company.service;

import com.company.model.User;
import com.company.service.base.IBaseService;

/**
 * @author kaichenkai
 * @date 2020-08-15 16:56
 */

public interface IUserService extends IBaseService<User> {
    //特有的方法
    public User login(String username, String password);
}
