package com.mamba.cig.cigbiz.dao;

import com.mamba.cig.cigbiz.po.CigPO;
import com.mamba.cig.cigbiz.po.CigarettePO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * desc:
 * author:zhongjianbin
 * Date:2019/10/8 10:31
 */
@Repository
public interface CigDao {

    CigPO findByCode(String barCode);
    CigPO findByName(String productName);
    List<CigPO> findByFuzzyName(String productName);


}
