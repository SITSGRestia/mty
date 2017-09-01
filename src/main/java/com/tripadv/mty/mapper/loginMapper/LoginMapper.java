package com.tripadv.mty.mapper.loginMapper;

import com.tripadv.mty.domain.login.User;

public interface LoginMapper {

    void register(User user);

    User login(User user);
}
