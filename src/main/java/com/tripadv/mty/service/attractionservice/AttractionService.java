package com.tripadv.mty.service.attractionservice;

import com.tripadv.mty.domain.page.AttractionPage;
import com.tripadv.mty.domain.attraction.Attraction;

import java.util.List;

public interface AttractionService {
    //分页查询信息
    public List<Attraction> findByPage(AttractionPage attractionPage);

    //添加信息
    public void saveAttraction(Attraction attraction);


    Attraction findAccountInfo(Attraction attraction1);

    ////根据id查询信息
    public Attraction findAttractionInfo(Attraction attraction);

    //根据id删除信息
    public void deleteAttractionInfo(Attraction attraction);

    //  根据id修改信息
    public void updateAttractionioInfo(Attraction attraction);

    //修改
    void updateAttractionInfo(Attraction attraction);
}
