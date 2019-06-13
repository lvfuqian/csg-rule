package com.zeen.csgrule.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.zeen.csgrule.common.utils.PageUtils;
import com.zeen.csgrule.entity.CollectionEntity;

import java.util.Map;

/**
 * ${comments}
 *
 * @author taemin
 * @email 
 * @date 2019-06-13 11:38:09
 */
public interface CollectionService extends IService<CollectionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

