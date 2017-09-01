package com.tripadv.mty.controller.LoginController;

import com.tripadv.mty.domain.login.User;
import com.tripadv.mty.service.login.LoginService;
import com.tripadv.mty.util.MD5Tools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("login")
public class LoginController {

    @Autowired
    private LoginService loginService;


    @RequestMapping("toRegister.do")
    public String toRegister(){
        return "backend/register";
    }

    @RequestMapping("register.do")
    public String register(User user){
        String password = MD5Tools.MD5(user.getPassword());
        User newUser = new User();
        newUser.setUsername(user.getUsername());
        newUser.setPassword(password);
        loginService.register(newUser);
        return "backend/login";
    }

    @RequestMapping("login.do")
    public String login(User user,Model model){
        //System.out.println("===="+user);
        String password = MD5Tools.MD5(user.getPassword());
        //System.out.println("加密后的密码为："+password);
        User newUser = new User();
        newUser.setUsername(user.getUsername());
        newUser.setPassword(password);
        User u = loginService.login(newUser);
        //System.out.println(u);
        if(u!=null) {
            model.addAttribute("u", u);
            return "/backend/index";
        }
        return "backend/login";

    }
}
