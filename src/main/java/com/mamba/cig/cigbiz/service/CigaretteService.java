package com.mamba.cig.cigbiz.service;

import com.mamba.cig.cigbiz.RestResponse;
import com.mamba.cig.cigbiz.dao.CigaretteDao;
import com.mamba.cig.cigbiz.error.ServiceError;
import com.mamba.cig.cigbiz.po.CigarettePO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * desc:
 * author:zhongjianbin
 * Date:2019/10/24 16:54
 */
@Service
public class CigaretteService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CigaretteService.class);

    @Autowired
    private CigaretteDao cigaretteDao;

    public RestResponse codeDetails(String code){
        try {
            CigarettePO details = cigaretteDao.findByCode(code);
            return RestResponse.success(details);
        }catch (Exception e){
            LOGGER.error("CigService details error {}",e);
            return RestResponse.error(ServiceError.CIG_NOT_FOUND_ERROR);
        }
    }

    public RestResponse nameDetails(String name){
        try {
            CigarettePO details = cigaretteDao.findByName(name);
            return RestResponse.success(details);
        }catch (Exception e){
            LOGGER.error("CigService nameDetails error {}",e);
            return RestResponse.error(ServiceError.CIG_NOT_FOUND_ERROR);
        }
    }

    public RestResponse<CigarettePO> fuzzyNamesDetails(String name){
        List<CigarettePO> pos = new ArrayList<>();
        try {
            List<CigarettePO> cigPOS = cigaretteDao.findByFuzzyName(name);
            for (CigarettePO cigPO: cigPOS){
                pos.add(cigPO);
            }
            return RestResponse.success(pos);
        }catch (Exception e){
            LOGGER.error("CigService namesDetails error {}",e);
            return RestResponse.error(ServiceError.CIG_NOT_FOUND_ERROR);
        }
    }


}
