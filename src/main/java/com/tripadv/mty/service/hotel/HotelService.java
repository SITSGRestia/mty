package com.tripadv.mty.service.hotel;

import com.tripadv.mty.domain.commons.City;
import com.tripadv.mty.domain.hotel.Hotel;
import com.tripadv.mty.domain.hotel.category.HotelBrand;
import com.tripadv.mty.domain.hotel.category.HotelCategory;
import com.tripadv.mty.domain.hotel.category.HotelStyle;
import com.tripadv.mty.domain.hotel.category.HotelsService;
import com.tripadv.mty.domain.page.HotelPage;

import java.util.List;
import java.util.Map;

public interface HotelService {

    List<Hotel> findAllHotel();

    List<Hotel> findByPage(HotelPage hotelPage);

    List<HotelsService> findAllHotelsService();

    List<HotelCategory> findAllHotelCategory();

    List<HotelStyle> findAllHotelStyle();

    List<HotelBrand> findAllHotelBrand();

    void addHotel(Hotel hotel,Integer[] hserviceIds);

    List<City> findAllCity();

    void update(Hotel hotel,Integer[] hserviceIds);

    Hotel findHotelById(Integer hotelId);

    void delete(Integer hotelId);

}
