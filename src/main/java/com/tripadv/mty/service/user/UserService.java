package com.tripadv.mty.service.user;


import com.tripadv.mty.domain.user.User;

public interface UserService {

    public void createUser(User user);

    public User findUser(String username);


}
