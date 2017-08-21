package com.tripadv.mty.controller.back;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/back")
@Controller
public class ListController {

    @RequestMapping(value = "/listtables",method = RequestMethod.GET)
    public String listTables(){
        return "back/tables";
    }
}
