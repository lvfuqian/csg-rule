package com.zeen.csgrule.service.impl;


import com.zeen.csgrule.common.utils.PageUtils;
import com.zeen.csgrule.common.utils.Query;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


import com.zeen.csgrule.dao.CollectionDao;
import com.zeen.csgrule.entity.CollectionEntity;
import com.zeen.csgrule.service.CollectionService;


@Service("collectionService")
public class CollectionServiceImpl extends ServiceImpl<CollectionDao, CollectionEntity> implements CollectionService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CollectionEntity> page = this.page(
                new Query<CollectionEntity>().getPage(params),
                new QueryWrapper<CollectionEntity>()
        );

        return new PageUtils(page);
    }

}