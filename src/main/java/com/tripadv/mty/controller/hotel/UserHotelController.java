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
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/Hotels")
public class UserHotelController {

    @Autowired
    private HotelService hotelService;

    @RequestMapping(value = "/findByPage",method = RequestMethod.POST)
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
        System.out.println("cityName"+hotelPage.getCityName());
        System.out.println("currentPage"+hotelPage.getCurrentPage());
        List<Hotel> hotelList = hotelService.findByPage(hotelPage);
        model.addAttribute("hotelList",hotelList);
        model.addAttribute("hotelPage",hotelPage);
        return "hotel/hotel_list";
    }

    @RequestMapping(value = "/findById",method = RequestMethod.GET)
    public String findById(Integer hotelId,Model model) {
        Hotel hotel = hotelService.findHotelById(hotelId);
        model.addAttribute("hotel",hotel);
        return "hotel/hotel_detail";
    }

    @RequestMapping(value = "/findByPageAsy",method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> findByPageAsy(HotelPage hotelPage){
        List<Hotel> hotelList = hotelService.findByPage(hotelPage);
        Map<String,Object> map = new HashMap<>();
        map.put("hotelList",hotelList);
        map.put("hotelPage",hotelPage);
        return map;
    }

}
