package com.planet.shop.api.service.impl;

import com.planet.shop.api.service.CmsPrefrenceAreaService;
import com.planet.shop.mbg.mapper.CmsPrefrenceAreaMapper;
import com.planet.shop.mbg.model.CmsPrefrenceArea;
import com.planet.shop.mbg.model.CmsPrefrenceAreaExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zc on 2019/8/2.
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
