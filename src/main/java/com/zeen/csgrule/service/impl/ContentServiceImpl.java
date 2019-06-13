package com.zeen.csgrule.service.impl;


import com.zeen.csgrule.common.utils.PageUtils;
import com.zeen.csgrule.common.utils.Query;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


import com.zeen.csgrule.dao.ContentDao;
import com.zeen.csgrule.entity.ContentEntity;
import com.zeen.csgrule.service.ContentService;


@Service("contentService")
public class ContentServiceImpl extends ServiceImpl<ContentDao, ContentEntity> implements ContentService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ContentEntity> page = this.page(
                new Query<ContentEntity>().getPage(params),
                new QueryWrapper<ContentEntity>()
        );

        return new PageUtils(page);
    }

}