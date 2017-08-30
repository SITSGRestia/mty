package com.tripadv.mty.mapper.hotel;

import com.tripadv.mty.domain.commons.City;
import com.tripadv.mty.domain.hotel.Hotel;
import com.tripadv.mty.domain.hotel.category.HotelBrand;
import com.tripadv.mty.domain.hotel.category.HotelCategory;
import com.tripadv.mty.domain.hotel.category.HotelStyle;
import com.tripadv.mty.domain.hotel.category.HotelsService;
import com.tripadv.mty.domain.page.HotelPage;

import java.util.List;
import java.util.Map;

public interface HotelMapper {
    List<Hotel> findAll();

    List<Hotel> findByPage(HotelPage hotelPage);

    int findRecords(HotelPage hotelPage);

    List<HotelsService> findAllHotelsService();

    List<HotelCategory> findAllHotelCategory();

    List<HotelStyle> findAllHotelStyle();

    List<HotelBrand> findAllHotelBrand();

    void save(Hotel hotel);

    List<City> findAllCity();

    void saveMiddleHotelService(Map<String, Integer> map);

    Hotel findHotelById(Integer hotelId);

    void deleteMiddleHotelService(Integer hotelId);

    void update(Hotel hotel);

    void delete(Integer hotelId);
}
