package com.zeen.csgrule.service.impl;

import com.zeen.csgrule.common.utils.PageUtils;
import com.zeen.csgrule.common.utils.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


import com.zeen.csgrule.dao.AccountDao;
import com.zeen.csgrule.entity.AccountEntity;
import com.zeen.csgrule.service.AccountService;


@Service("accountService")
public class AccountServiceImpl extends ServiceImpl<AccountDao, AccountEntity> implements AccountService {
    @Autowired
    AccountDao accountDao;

    @Override
    public List<Map<Object, Object>> showMsg(Map<String, Object> params) {
        List<Map<Object, Object>> map = accountDao.showMsg(params);
        return map;
    }

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<AccountEntity> page = this.page(
                new Query<AccountEntity>().getPage(params),
                new QueryWrapper<AccountEntity>()
        );

        return new PageUtils(page);
    }

}