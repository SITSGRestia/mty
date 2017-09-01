package com.tripadv.mty.service.login;


import com.tripadv.mty.domain.login.Admin;

public interface LoginService {
    boolean validateAdmin(Admin admin);
}
