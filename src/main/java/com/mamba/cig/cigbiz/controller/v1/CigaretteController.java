package com.mamba.cig.cigbiz.controller.v1;

import com.mamba.cig.cigbiz.RestResponse;
import com.mamba.cig.cigbiz.po.CigarettePO;
import com.mamba.cig.cigbiz.service.CigaretteService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * desc:
 * author:zhongjianbin
 * Date:2019/10/24 17:01
 */
@RestController
@RequestMapping("/api/v1/*")
public class CigaretteController {

    @Autowired
    private CigaretteService cigService;

    @ApiOperation("cig详情")
    @RequestMapping(value = "/cigarette/code/{code}", method = RequestMethod.GET)
    public RestResponse details(@PathVariable("code") String code){
        return cigService.codeDetails(code);
    }

    @ApiOperation("cig详情")
    @RequestMapping(value = "/cigarette/name/{cigName}", method = RequestMethod.GET)
    public RestResponse nameDetails(@PathVariable("cigName") String cigName){
        return cigService.nameDetails(cigName);
    }

    @ApiOperation("cig详情")
    @RequestMapping(value = "/cigarette/fuzzynames/{cigName}", method = RequestMethod.GET)
    public RestResponse<CigarettePO> namesDetails(@PathVariable("cigName") String cigName){
        return cigService.fuzzyNamesDetails(cigName);
    }
}
