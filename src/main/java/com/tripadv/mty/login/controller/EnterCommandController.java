package com.tripadv.mty.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EnterCommandController {

    @RequestMapping(value = "/yztcadmin222222",method = RequestMethod.GET)
    public String loginAdmin(){
        return "backend/login";
    }


}
