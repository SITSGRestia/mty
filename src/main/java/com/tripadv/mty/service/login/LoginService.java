package com.tripadv.mty.service.login;


import com.tripadv.mty.domain.login.User;

public interface LoginService {

    void register(User user);

    User login(User user);
}
