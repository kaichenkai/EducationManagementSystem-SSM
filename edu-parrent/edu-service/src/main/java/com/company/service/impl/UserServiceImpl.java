package com.company.service.impl;

import com.company.model.User;
import com.company.service.IUserService;
import com.company.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author kaichenkai
 * @date 2020-08-15 17:01
 */

@Service
@Transactional
public class UserServiceImpl extends BaseServiceImpl<User> implements IUserService {
    public User login(String username, String password) {
        return null;
    }

    public User findById(Integer id) {
        return userMapper.findById(id);
    }

    public User findById(String id) {
        return null;
    }

    public void deleteById(Integer id) {

    }

    public void deleteById(String id) {

    }

    public void update(User user) {

    }

    public void insert(User user) {

    }
}
