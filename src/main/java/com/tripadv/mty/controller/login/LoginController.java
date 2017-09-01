package com.tripadv.mty.controller.login;

import com.tripadv.mty.domain.login.Admin;
import com.tripadv.mty.service.login.LoginService;
import com.tripadv.mty.util.MD5Tools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "/loginAdmin",method = RequestMethod.POST)
    public String toIndex(Admin admin, HttpSession session){
        String passwood = MD5Tools.MD5(admin.getPassword());
        Admin newUser = new Admin();
        newUser.setAdminName(admin.getAdminName());
        newUser.setPassword(passwood);
        Boolean flag = loginService.validateAdmin(newUser);
        if (flag){
            session.setAttribute("adminName",admin.getAdminName());
            return "backend/index";
        }
        return "backend/error";
    }
}
