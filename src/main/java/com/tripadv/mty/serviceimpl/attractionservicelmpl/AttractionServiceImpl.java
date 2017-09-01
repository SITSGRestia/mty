package com.tripadv.mty.serviceimpl.attractionservicelmpl;

import com.tripadv.mty.domain.page.AttractionPage;
import com.tripadv.mty.domain.attraction.Attraction;
import com.tripadv.mty.mapper.attractionmapper.AttractionMapper;
import com.tripadv.mty.service.attractionservice.AttractionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("attractionService")
public class AttractionServiceImpl implements AttractionService {
    @Autowired
    private AttractionMapper attractionMapper;




    //分页
    @Override
    public List<Attraction> findByPage(AttractionPage attractionPage) {

        attractionPage.setPageSize(3);
        attractionPage.setRecords(attractionMapper.findAllrecords());
        System.out.println(attractionMapper.findAllrecords());
        return attractionMapper.findByPage(attractionPage);
    }
       //添加
    @Override
    public void saveAttraction(Attraction attraction) {
        attractionMapper.saveAttraction(attraction);
    }

    @Override
    public Attraction findAccountInfo(Attraction attraction1) {
        return null;
    }

    //根据ID查询
    @Override
    public Attraction findAttractionInfo(Attraction attraction) {
        return attractionMapper.findAttractionInfo(attraction.getId());
    }
    //删除
    @Override
    public void deleteAttractionInfo(Attraction attraction){
        attractionMapper.deleteAttractionInfo(attraction.getId());
    }

    @Override
    public void updateAttractionioInfo(Attraction attraction) {

    }

    //修改
    @Override
    public void updateAttractionInfo(Attraction attraction) {

        attractionMapper.updateAttractionInfo(attraction);
    }
}
