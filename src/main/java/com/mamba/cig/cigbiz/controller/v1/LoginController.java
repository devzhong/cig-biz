package com.mamba.cig.cigbiz.controller.v1;

import com.mamba.cig.cigbiz.RestResponse;
import com.mamba.cig.cigbiz.service.LoginService;
import com.mamba.cig.cigbiz.vo.serarch.SearchUserVO;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * desc:
 * author:zhongjianbin
 * Date:2019/9/30 13:49
 */
@RestController
@RequestMapping("/api/v1/*")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @ApiOperation("用户登录")
    @RequestMapping(value = "/logins", method = RequestMethod.POST)
    public RestResponse create(@RequestBody SearchUserVO vo){
        return loginService.create(vo);
    }
}
