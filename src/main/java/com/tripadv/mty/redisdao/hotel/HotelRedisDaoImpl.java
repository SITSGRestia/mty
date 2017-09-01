package com.tripadv.mty.redisdao.hotel;

import com.tripadv.mty.domain.hotel.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@Repository
public class HotelRedisDaoImpl implements HotelRedisDao {

    @Autowired
    private RedisTemplate<String,Hotel> redisTemplate;

    private ValueOperations<String,Hotel> valueOperations;


    @PostConstruct
    public void init(){
        valueOperations = redisTemplate.opsForValue();
    }

    @Override
    public void saveHotel(Hotel hotel) {
        valueOperations.set("hotel"+hotel.getHot_id(),hotel);
    }

    @Override
    public List<Hotel> findHotel() {
        return valueOperations.multiGet(Arrays.asList("hotel"));
    }

    @Override
    public Hotel findHotelById(Integer id) {
        return valueOperations.get("hotel"+id);
    }
}
