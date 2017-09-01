package com.tripadv.mty.controller.RestaurantController;

import com.tripadv.mty.domain.page.RestaurantPage;
import com.tripadv.mty.domain.restaurant.*;
import com.tripadv.mty.service.Restaurant.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/restaurant")
public class RestaurantController {

    @Autowired
    RestaurantService restaurantService;

    /**  分页查询  **/
    @RequestMapping("/findByPage.do")
    public String findByPage(RestaurantPage restaurantPage, Model model){
        List<Restaurant> restaurantList = restaurantService.findByPage(restaurantPage);
        model.addAttribute("restaurantList",restaurantList);
        model.addAttribute("restaurantPage",restaurantPage);
        return "/backend/list";
    }

    /** 跳转到添加页面 **/
    @RequestMapping("toAdd.do")
    public String toAdd(Model model){

        List<Rcategory> rcategoryList = restaurantService.findByPage1();
        List<Rfood> rfoodList = restaurantService.findByPage2();
        List<Ratmosphere> ratmosphereList = restaurantService.findByPage3();
        List<Rfeature> rfeatureList = restaurantService.findByPage4();
        List<Rhobby> rhobbyList = restaurantService.findByPage5();
        List<Rmealtime> rmealtimeList = restaurantService.findByPage6();
        List<Rnearby> rnearbyList = restaurantService.findByPage7();
        List<Rprice> rpriceList = restaurantService.findByPage8();

        model.addAttribute("rcategoryList",rcategoryList);
        model.addAttribute("rfoodList",rfoodList);
        model.addAttribute("ratmosphereList",ratmosphereList);
        model.addAttribute("rfeatureList",rfeatureList);
        model.addAttribute("rhobbyList",rhobbyList);
        model.addAttribute("rmealtimeList",rmealtimeList);
        model.addAttribute("rnearbyList",rnearbyList);
        model.addAttribute("rpriceList",rpriceList);

        return "/backend/add";
    }

    /** 添加餐厅 */
    @RequestMapping("/addRestaurant.do")
    public String addRestaurant(Restaurant restaurant,RestaurantPage restaurantPage, Model model){
        restaurantService.addRestaurant(restaurant);
        return "redirect:/restaurant/findByPage.do?restaurantPage="+restaurantPage;
    }

    /** 删除餐厅 */
    @RequestMapping("/deleteRestaurant.do")
    public String deleteRestaurant(Restaurant restaurant,RestaurantPage restaurantPage, Model model){
        restaurantService.deleteRestaurant(restaurant);
        return "redirect:/restaurant/findByPage.do";
    }

    /** 跳转到修改餐厅页面 */
    @RequestMapping("/toUpdateRestarant.do")
    public String toUpdate(Model model,Restaurant restaurant,RestaurantPage restaurantPage){
        Restaurant r = restaurantService.findRestaurantById(restaurant);
        List<Rcategory> rcategoryList = restaurantService.findByPage1();
        List<Rfood> rfoodList = restaurantService.findByPage2();
        List<Ratmosphere> ratmosphereList = restaurantService.findByPage3();
        List<Rfeature> rfeatureList = restaurantService.findByPage4();
        List<Rhobby> rhobbyList = restaurantService.findByPage5();
        List<Rmealtime> rmealtimeList = restaurantService.findByPage6();
        List<Rnearby> rnearbyList = restaurantService.findByPage7();
        List<Rprice> rpriceList = restaurantService.findByPage8();

        model.addAttribute("rcategoryList",rcategoryList);
        model.addAttribute("rfoodList",rfoodList);
        model.addAttribute("ratmosphereList",ratmosphereList);
        model.addAttribute("rfeatureList",rfeatureList);
        model.addAttribute("rhobbyList",rhobbyList);
        model.addAttribute("rmealtimeList",rmealtimeList);
        model.addAttribute("rnearbyList",rnearbyList);
        model.addAttribute("rpriceList",rpriceList);
        model.addAttribute("r",r);
        model.addAttribute("restaurantPage",restaurantPage);

        return "/backend/update";
    }

    /** 修改餐厅信息 */
    @RequestMapping("/updateRestaurant.do")
    public String UpdateRestaurant(Restaurant restaurant,Model model,RestaurantPage restaurantPage){
        restaurantService.updateRestaurant(restaurant);
        return "redirect:/restaurant/findByPage.do?restaurantPage="+restaurantPage;
    }


}
