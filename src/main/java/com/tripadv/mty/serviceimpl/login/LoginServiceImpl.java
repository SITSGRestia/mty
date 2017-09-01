package com.tripadv.mty.serviceimpl.login;

import com.tripadv.mty.domain.login.Admin;
import com.tripadv.mty.repository.login.LoginRepository;
import com.tripadv.mty.service.login.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("loginService")
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginRepository repository;

    @Override
    public boolean validateAdmin(Admin admin) {
        Admin newAdmin = repository.findByAdminNameAndPassword(admin.getAdminName(),admin.getPassword());
        if (newAdmin==null){
            return false;
        }
        return true;
    }
}
