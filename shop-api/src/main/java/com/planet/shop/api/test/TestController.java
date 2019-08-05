package com.planet.shop.api.test;

import com.planet.shop.api.service.CmsPrefrenceAreaService;
import com.planet.shop.mbg.model.CmsPrefrenceArea;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by zc on 2019/8/2.
 */
@Controller
@RequestMapping("/api")
public class TestController {
    @Autowired
    CmsPrefrenceAreaService prefrenceAreaService;

    @ApiOperation("获取所有商品优选")
    @RequestMapping(value = "/listAll", method = RequestMethod.GET)
    @ResponseBody
    public Object listAll() {
        List<CmsPrefrenceArea> prefrenceAreaList = prefrenceAreaService.listAll();
        return prefrenceAreaList;
    }
}
