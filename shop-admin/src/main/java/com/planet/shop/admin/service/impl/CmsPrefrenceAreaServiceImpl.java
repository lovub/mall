package com.planet.shop.admin.service.impl;

import com.planet.shop.admin.service.CmsPrefrenceAreaService;
import com.planet.shop.mbg.mapper.CmsPrefrenceAreaMapper;
import com.planet.shop.mbg.model.CmsPrefrenceArea;
import com.planet.shop.mbg.model.CmsPrefrenceAreaExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 商品优选Service实现类
 * Created by macro on 2018/6/1.
 */
@Service
public class CmsPrefrenceAreaServiceImpl implements CmsPrefrenceAreaService {
    @Autowired
    private CmsPrefrenceAreaMapper prefrenceAreaMapper;

    @Override
    public List<CmsPrefrenceArea> listAll() {
        return prefrenceAreaMapper.selectByExample(new CmsPrefrenceAreaExample());
    }
}
