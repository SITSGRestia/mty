package com.tripadv.mty.mapper.restaurantMapper;

import com.tripadv.mty.domain.page.RestaurantPage;
import com.tripadv.mty.domain.restaurant.*;

import java.util.List;

public interface RestaurantMapper {

    /** 查询总得记录数 */
    int findRecords(RestaurantPage restaurantPage);

    /** 分页查询餐厅信息 */
    List<Restaurant> findByPage(RestaurantPage restaurantPage);

    /** 查询餐厅类型 */
    List<Rcategory> findByPage1();

    /** 查询菜系分类 */
    List<Rfood> findByPage2();

    /** 查询用餐氛围 */
    List<Ratmosphere> findByPage3();

    /** 查询餐厅特点 */
    List<Rfeature> findByPage4();

    /** 查询用餐要求 */
    List<Rhobby> findByPage5();

    /** 查询餐厅营业时间 */
    List<Rmealtime> findByPage6();

    /** 查询餐厅附近时间 */
    List<Rnearby> findByPage7();

    /** 查询餐厅价格 */
    List<Rprice> findByPage8();

    /** 添加餐厅 */
    void addRestaurant(Restaurant restaurant);

    /** 删除餐厅 */
    void deleteRestaurant(Restaurant restaurant);

    /** 通过id查询餐厅信息 */
    Restaurant findRestaurantById(Restaurant restaurant);

    /** 修改餐厅 */
    void updateRestaurant(Restaurant restaurant);
}
