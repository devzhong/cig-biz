package com.mamba.cig.cigbiz.controller.v1;

import com.mamba.cig.cigbiz.RestResponse;
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
    @RequestMapping(value = "/cigs/{code}", method = RequestMethod.GET)
    public RestResponse details(@PathVariable("code") String code){
        return cigService.details(code);
    }
}
