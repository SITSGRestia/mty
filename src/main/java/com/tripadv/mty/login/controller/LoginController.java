package com.tripadv.mty.login.controller;

import com.tripadv.mty.login.domain.Admin;
import com.tripadv.mty.util.MD5Tools;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @RequestMapping(value = "/loginAdmin",method = RequestMethod.POST)
    public String toIndex(Admin admin, HttpSession session){
        String passwood = MD5Tools.MD5(admin.getPassword());
        Admin newUser = new Admin();
        newUser.setAdminName(admin.getAdminName());
        newUser.setPassword(passwood);

        session.setAttribute("adminName",admin.getAdminName());
        return "backend/index";
    }
}
