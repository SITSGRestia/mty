package com.tripadv.mty.mapper.attractionmapper;

import com.tripadv.mty.domain.page.AttractionPage;
import com.tripadv.mty.domain.attraction.Attraction;

import java.util.List;

public interface AttractionMapper {
    //分页查询信息
    public List<Attraction> findByPage(AttractionPage attractionPage);

    //查询总的记录数
    public int findAllrecords();

    //添加信息
    public  void saveAttraction(Attraction attraction);

    //根据id查询信息
    public Attraction findAttractionInfo(Integer id);

    //根据id删除信息
    public void deleteAttractionInfo(Integer id);

    // 根据id修改信息
    public void updateAttractionInfo(Attraction attraction);
}
