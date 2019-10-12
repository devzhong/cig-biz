package com.mamba.cig.cigbiz.service;

import com.mamba.cig.cigbiz.RestResponse;
import com.mamba.cig.cigbiz.dao.CigDao;
import com.mamba.cig.cigbiz.error.ServiceError;
import com.mamba.cig.cigbiz.po.CigPO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * desc:
 * author:zhongjianbin
 * Date:2019/10/8 10:39
 */
@Service
public class CigService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CigService.class);

    @Autowired
    private CigDao cigDao;

    public RestResponse details(String code){
        try {
            CigPO details = cigDao.findByCode(code);
            return RestResponse.success(details);
        }catch (Exception e){
            LOGGER.error("CigService details error {}",e);
            return RestResponse.error(ServiceError.CIG_NOT_FOUND_ERROR);
        }
    }
}
