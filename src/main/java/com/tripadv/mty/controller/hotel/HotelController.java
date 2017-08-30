package com.tripadv.mty.controller.hotel;

import com.tripadv.mty.domain.commons.City;
import com.tripadv.mty.domain.hotel.Hotel;
import com.tripadv.mty.domain.hotel.category.HotelBrand;
import com.tripadv.mty.domain.hotel.category.HotelCategory;
import com.tripadv.mty.domain.hotel.category.HotelStyle;
import com.tripadv.mty.domain.hotel.category.HotelsService;
import com.tripadv.mty.domain.page.HotelPage;
import com.tripadv.mty.service.hotel.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/hotel")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    public String findAll(Model model){
        List<Hotel> hotelList = hotelService.findAllHotel();
        model.addAttribute("hotelList",hotelList);
        return "backend/hotel_list";
    }

    @RequestMapping(value = "/findByPage",method = RequestMethod.GET)
    public String findByPage(Model model, HotelPage hotelPage, HttpSession session){
        if(session.getAttribute("listHotelsService")==null){
            List<HotelsService> listHotelsService = hotelService.findAllHotelsService();
            session.setAttribute("listHotelsService",listHotelsService);
        }
        if (session.getAttribute("listHotelCategory")==null){
            List<HotelCategory> listHotelCategory = hotelService.findAllHotelCategory();
            session.setAttribute("listHotelCategory",listHotelCategory);
        }
        if (session.getAttribute("listHotelStyle")==null){
            List<HotelStyle> listHotelStyle = hotelService.findAllHotelStyle();
            session.setAttribute("listHotelStyle",listHotelStyle);
        }
        if (session.getAttribute("listHotelBrand")==null){
            List<HotelBrand> listHotelBrand = hotelService.findAllHotelBrand();
            session.setAttribute("listHotelBrand",listHotelBrand);
        }
        if (session.getAttribute("listCity")==null){
            List<City> listCity = hotelService.findAllCity();
            session.setAttribute("listCity",listCity);
        }
        List<Hotel> hotelList = hotelService.findByPage(hotelPage);
        model.addAttribute("hotelList",hotelList);
        model.addAttribute("hotelPage",hotelPage);
        return "backend/hotel_list";
    }


    @RequestMapping(value = "/toAdd",method = RequestMethod.GET)
    public String toAdd(){
        return "backend/hotel_add";
    }

    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public String add(Hotel hotel,Integer[] hserviceIds){
        hotelService.addHotel(hotel,hserviceIds);
        return "redirect:/hotel/findByPage";
    }

    @RequestMapping(value = "/toUpdate",method = RequestMethod.GET)
    public String toUpdate(Model model,Integer hotelId){
        Hotel hotel = hotelService.findHotelById(hotelId);
        model.addAttribute("hotel",hotel);
        return "backend/hotel_modi";
    }

    @RequestMapping(value = "/update",method = RequestMethod.GET)
    public String update(Hotel hotel,Integer[] hserviceIds){
        hotelService.update(hotel,hserviceIds);
        return "redirect:/hotel/findByPage";
    }

    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public String delete(Integer hotelId){
        hotelService.delete(hotelId);
        return "redirect:/hotel/findByPage";
    }

}
