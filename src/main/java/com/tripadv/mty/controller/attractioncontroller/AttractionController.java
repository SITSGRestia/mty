package com.tripadv.mty.controller.attractioncontroller;

import com.tripadv.mty.domain.page.AttractionPage;
import com.tripadv.mty.domain.attraction.Attraction;
import com.tripadv.mty.service.attractionservice.AttractionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/attraction")
public class AttractionController {
    @Autowired
    private AttractionService attractionService;



    @RequestMapping("/findByPage.do")
    public String findByPage(AttractionPage attractionPage, Model model){
        List<Attraction> listAttraction = attractionService.findByPage(attractionPage);
        model.addAttribute("attractionPage",attractionPage);
        model.addAttribute("listAttraction",listAttraction);

        return "backend/list";
    }

    @RequestMapping("/toAdd.do")
    public String toAdd(){

        return "backend/add";
    }
    @RequestMapping("/toUpdate.do")
    public String toUpdate(Attraction attraction1,Model model){
        Attraction attraction =attractionService.findAccountInfo(attraction1);
        model.addAttribute("attraction",attraction);
        return "backend/update";
    }







    @RequestMapping("/saveAttraction.do")
    public String saveAttraction(Attraction attraction){

        attractionService.saveAttraction(attraction);
        return "redirect:/backend/findByPage.do";
    }

    @RequestMapping("/delete.do")
    public String deleteAttraction(Attraction attraction){
        attractionService.deleteAttractionInfo(attraction);
        return "redirect:/beckend/findByPage.do";
    }
    @RequestMapping("/update.do")
    public String updateAttraction(Attraction attraction){
        attractionService.updateAttractionInfo(attraction);
        return "redirect:/backend/findByPage.do";
    }



}
