package com.tripadv.mty.redisdao.hotel;

import com.tripadv.mty.domain.hotel.Hotel;

import java.util.List;

public interface HotelRedisDao {
    void saveHotel(Hotel hotel);
    List<Hotel> findHotel();
    Hotel findHotelById(Integer id);
}
