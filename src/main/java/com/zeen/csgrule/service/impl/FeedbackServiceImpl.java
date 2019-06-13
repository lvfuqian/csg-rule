package com.zeen.csgrule.service.impl;


import com.zeen.csgrule.common.utils.PageUtils;
import com.zeen.csgrule.common.utils.Query;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


import com.zeen.csgrule.dao.FeedbackDao;
import com.zeen.csgrule.entity.FeedbackEntity;
import com.zeen.csgrule.service.FeedbackService;


@Service("feedbackService")
public class FeedbackServiceImpl extends ServiceImpl<FeedbackDao, FeedbackEntity> implements FeedbackService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<FeedbackEntity> page = this.page(
                new Query<FeedbackEntity>().getPage(params),
                new QueryWrapper<FeedbackEntity>()
        );

        return new PageUtils(page);
    }

}