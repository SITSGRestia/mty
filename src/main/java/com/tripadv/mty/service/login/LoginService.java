package com.tripadv.mty.service.login;


<<<<<<< HEAD
import com.tripadv.mty.domain.login.Admin;

public interface LoginService {
    boolean validateAdmin(Admin admin);
=======
import com.tripadv.mty.domain.login.User;

public interface LoginService {

    void register(User user);

    User login(User user);
>>>>>>> origin/lijinhui
}
