package com.tripadv.mty.serviceimpl.user;

import com.tripadv.mty.domain.user.User;
import com.tripadv.mty.mapper.user.UserMapper;
import com.tripadv.mty.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImp implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public void createUser(User user) {
        userMapper.createUser(user);
    }

    @Override
    public User findUser(String username) {
        return userMapper.findUser(username);
    }
}
