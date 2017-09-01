package com.tripadv.mty.controller.user;

import com.tripadv.mty.domain.user.User;
import com.tripadv.mty.service.user.UserService;
import com.tripadv.mty.util.PasswordHandler;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class UserController {

    private static Logger logger = LoggerFactory.getLogger(UserController.class);



    @Autowired
    private UserService userService;

    @Autowired
    PasswordHandler handler;

    @RequestMapping(value = "/openUser", method = RequestMethod.GET)
    public String openUser() {

        try {
            logger.info("--->>");
        }catch (Exception e){
            logger.info(e.getMessage());
        }

        return "/user/createuser";
    }


    @RequestMapping(value = "/createUser", method = RequestMethod.POST)
    public String createUser(User user) {
        handler.encryptPassword(user);
        userService.createUser(user);

        return "/user/success";
    }

    @RequestMapping(value = "/loginUser", method = RequestMethod.POST)
    public String loginUser(String username, String password, Model model) {

        Subject subject = SecurityUtils.getSubject();
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        handler.encryptPassword(user);
        UsernamePasswordToken token = new UsernamePasswordToken(user.getUsername(), user.getPassword(), true);
        //SecurityUtils.getSecurityManager().login(subject, token);
        subject.login(token);
        System.out.println("-1--username--->>" + token.getUsername());
        System.out.println("-1--password--->>" + token.getPassword());

        if (subject.isAuthenticated()) {
            return "redirect:/enter";
        }
        return null;
    }

}
