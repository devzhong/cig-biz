package com.mamba.cig.cigbiz.controller.v1;

import com.mamba.cig.cigbiz.RestResponse;
import com.mamba.cig.cigbiz.po.CigPO;
import com.mamba.cig.cigbiz.service.CigService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * desc:
 * author:zhongjianbin
 * Date:2019/10/8 11:22
 */
@RestController
@RequestMapping("/api/v1/*")
public class CigController {

    @Autowired
    private CigService cigService;

    @ApiOperation("cig详情")
    @RequestMapping(value = "/cigs/{barCode}", method = RequestMethod.GET)
    public RestResponse details(@PathVariable("barCode") String barCode){
        return cigService.details(barCode);
    }

    @ApiOperation("cig详情")
    @RequestMapping(value = "/cigs/name/{productName}", method = RequestMethod.GET)
    public RestResponse nameDetails(@PathVariable("productName") String productName){
        return cigService.nameDetails(productName);
    }

    @ApiOperation("cig详情")
    @RequestMapping(value = "/cigs/names/{productName}", method = RequestMethod.GET)
    public RestResponse<CigPO> namesDetails(@PathVariable("productName") String productName){
        return cigService.namesDetails(productName);
    }
}
