package com.tripadv.mty.serviceimpl.Restaurant;

import com.tripadv.mty.domain.page.RestaurantPage;
import com.tripadv.mty.domain.restaurant.*;
import com.tripadv.mty.mapper.restaurantMapper.RestaurantMapper;
import com.tripadv.mty.service.Restaurant.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("restaurantService")
public class RestaurantServiceImpl implements RestaurantService {
    @Autowired
    RestaurantMapper restaurantMapper;


    @Override
    public List<Restaurant> findByPage(RestaurantPage restaurantPage) {
        int records = restaurantMapper.findRecords(restaurantPage);
        restaurantPage.setRecords(records);
        restaurantPage.setPageSize(2);

        return restaurantMapper.findByPage(restaurantPage);
    }

    @Override
    public List<Rcategory> findByPage1() {
        return restaurantMapper.findByPage1();
    }

    @Override
    public List<Rfood> findByPage2() {
        return restaurantMapper.findByPage2();
    }

    @Override
    public List<Ratmosphere> findByPage3() {
        return restaurantMapper.findByPage3();
    }

    @Override
    public List<Rfeature> findByPage4() {
        return restaurantMapper.findByPage4();
    }

    @Override
    public List<Rhobby> findByPage5() {
        return restaurantMapper.findByPage5();
    }

    @Override
    public List<Rmealtime> findByPage6() {
        return restaurantMapper.findByPage6();
    }

    @Override
    public List<Rnearby> findByPage7() {
        return restaurantMapper.findByPage7();
    }

    @Override
    public List<Rprice> findByPage8() {
        return restaurantMapper.findByPage8();
    }

    @Override
    public void addRestaurant(Restaurant restaurant) {

        restaurantMapper.addRestaurant(restaurant);

    }

    @Override
    public void deleteRestaurant(Restaurant restaurant) {
        restaurantMapper.deleteRestaurant(restaurant);
    }

    @Override
    public Restaurant findRestaurantById(Restaurant restaurant) {
        return restaurantMapper.findRestaurantById(restaurant);
    }

    @Override
    public void updateRestaurant(Restaurant restaurant) {
        restaurantMapper.updateRestaurant(restaurant);
    }
}
