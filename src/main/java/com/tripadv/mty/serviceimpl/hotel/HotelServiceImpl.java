package com.tripadv.mty.serviceimpl.hotel;

import com.tripadv.mty.domain.commons.City;
import com.tripadv.mty.domain.hotel.Hotel;
import com.tripadv.mty.domain.hotel.category.HotelBrand;
import com.tripadv.mty.domain.hotel.category.HotelCategory;
import com.tripadv.mty.domain.hotel.category.HotelStyle;
import com.tripadv.mty.domain.hotel.category.HotelsService;
import com.tripadv.mty.domain.page.HotelPage;
import com.tripadv.mty.mapper.hotel.HotelMapper;
import com.tripadv.mty.redisdao.hotel.HotelRedisDao;
import com.tripadv.mty.service.hotel.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("hotelService")
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelMapper hotelMapper;

    @Autowired
    private HotelRedisDao hotelRedisDao;

    @Override
    public List<Hotel> findAllHotel() {
        List<Hotel> hotelList = hotelMapper.findAll();
        return hotelList;
    }

    @Override
    public List<Hotel> findByPage(HotelPage hotelPage) {
        int records = hotelMapper.findRecords(hotelPage);
        hotelPage.setPageSize(2);
        hotelPage.setRecords(records);
        List<Hotel> hotelList = hotelMapper.findByPage(hotelPage);
        return hotelList;
    }

    @Override
    public List<HotelsService> findAllHotelsService() {
        return hotelMapper.findAllHotelsService();
    }

    @Override
    public List<HotelCategory> findAllHotelCategory() {
        return hotelMapper.findAllHotelCategory();
    }

    @Override
    public List<HotelStyle> findAllHotelStyle() {
        return hotelMapper.findAllHotelStyle();
    }

    @Override
    public List<HotelBrand> findAllHotelBrand() {
        return hotelMapper.findAllHotelBrand();
    }

    @Override
    @Transactional
    public void addHotel(Hotel hotel, Integer[] hserviceIds) {
        hotelMapper.save(hotel);
        for (Integer hserviceId : hserviceIds) {
            Map<String,Integer> map = new HashMap<String,Integer>();
            map.put("hotelId", hotel.getHot_id());
            map.put("hserviceId", hserviceId);
            hotelMapper.saveMiddleHotelService(map);
        }
    }


    @Override
    public List<City> findAllCity() {
        return hotelMapper.findAllCity();
    }

    @Override
    @Transactional
    public void update(Hotel hotel, Integer[] hserviceIds) {
        hotelMapper.update(hotel);
        hotelMapper.deleteMiddleHotelService(hotel.getHot_id());
        for (Integer hserviceId : hserviceIds) {
            Map<String,Integer> map = new HashMap<String,Integer>();
            map.put("hotelId", hotel.getHot_id());
            map.put("hserviceId", hserviceId);
            hotelMapper.saveMiddleHotelService(map);
        }

    }

    @Override
    public Hotel findHotelById(Integer hotelId) {
        Hotel hotel = hotelRedisDao.findHotelById(hotelId);
        System.out.println(hotel);
        if (hotel==null){
            System.out.println("没有在缓存中找到该酒店");
            Hotel hotel1 = hotelMapper.findHotelById(hotelId);
            hotelRedisDao.saveHotel(hotel1);
            return hotel1;
        }
        System.out.println("在缓存中找到该酒店");
        return hotel;
    }

    @Override
    @Transactional
    public void delete(Integer hotelId) {
        hotelMapper.delete(hotelId);
        hotelMapper.deleteMiddleHotelService(hotelId);
    }

}
