package com.mamba.cig.cigbiz.dao;

import com.mamba.cig.cigbiz.po.CigPO;
import org.springframework.stereotype.Repository;

/**
 * desc:
 * author:zhongjianbin
 * Date:2019/10/8 10:31
 */
@Repository
public interface CigDao {

    CigPO findByCode(String barCode);
}
