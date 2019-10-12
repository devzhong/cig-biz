package com.mamba.cig.cigbiz.service;

import com.mamba.cig.cigbiz.RestResponse;
import com.mamba.cig.cigbiz.dao.UserDao;
import com.mamba.cig.cigbiz.error.ServiceError;
import com.mamba.cig.cigbiz.po.UserPO;
import com.mamba.cig.cigbiz.vo.serarch.SearchUserVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * desc:
 * author:zhongjianbin
 * Date:2019/9/30 13:50
 */
@Service
public class LoginService {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoginService.class);

    @Autowired
    private UserDao userDao;

    public RestResponse create(SearchUserVO vo){
        try {
            UserPO po = userDao.findUser(vo);
            if (po != null){
                return RestResponse.success();
            }else {
                return RestResponse.error(ServiceError.CIG_PHONE_PASSWORD_ERROR);
            }
        }catch (Exception e){
            LOGGER.error("LoginService create error {}",e);
            return RestResponse.error(ServiceError.CIG_SERVICE_ERROR);
        }
    }
}
