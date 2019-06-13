package com.zeen.csgrule.dao;

import com.zeen.csgrule.entity.AccountEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * ${comments}
 * 
 * @author taemin
 * @email 
 * @date 2019-06-13 11:38:09
 */
@Mapper
public interface AccountDao extends BaseMapper<AccountEntity> {



    List<Map<Object, Object>> showMsg(Map<String, Object> params);
}
