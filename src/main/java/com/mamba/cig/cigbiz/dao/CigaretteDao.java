package com.mamba.cig.cigbiz.dao;

import com.mamba.cig.cigbiz.po.CigarettePO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * desc:
 * author:zhongjianbin
 * Date:2019/10/24 16:55
 */
@Repository
public interface CigaretteDao {

    CigarettePO findByCode(String code);
    CigarettePO findByName(String cigName);
    List<CigarettePO> findByFuzzyName(String cigName);
}
