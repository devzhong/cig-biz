package com.mamba.cig.cigbiz.dao;

import com.mamba.cig.cigbiz.po.UserPO;
import com.mamba.cig.cigbiz.vo.serarch.SearchUserVO;
import org.springframework.stereotype.Repository;

/**
 * desc:
 * author:zhongjianbin
 * Date:2019/9/30 10:55
 */
@Repository
public interface UserDao {

    UserPO findUser(SearchUserVO vo);
}
