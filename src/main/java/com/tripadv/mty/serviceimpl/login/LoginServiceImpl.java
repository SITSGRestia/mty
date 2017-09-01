package com.tripadv.mty.serviceimpl.login;

import com.tripadv.mty.mapper.loginMapper.LoginMapper;
import com.tripadv.mty.domain.login.User;
import com.tripadv.mty.service.login.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("loginService")
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginMapper loginMapper;

    @Override
    public void register(User user) {
        loginMapper.register(user);
    }

    @Override
    public User login(User user) {
        return loginMapper.login(user);
    }
}
