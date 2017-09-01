package com.tripadv.mty.mapper.user;

import com.tripadv.mty.domain.user.User;
import org.springframework.stereotype.Component;


@Component
public interface UserMapper {

    public void createUser(User user);

    public User findUser(String username);



}
