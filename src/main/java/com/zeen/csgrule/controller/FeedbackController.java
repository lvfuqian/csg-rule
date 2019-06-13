package com.zeen.csgrule.controller;

import java.util.Arrays;
import java.util.Map;

import com.zeen.csgrule.common.utils.PageUtils;
import com.zeen.csgrule.common.utils.R;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zeen.csgrule.entity.FeedbackEntity;
import com.zeen.csgrule.service.FeedbackService;



/**
 * ${comments}
 *
 * @author taemin
 * @email 
 * @date 2019-06-13 11:38:09
 */
@RestController
@RequestMapping("/feedback")
public class FeedbackController {
    @Autowired
    private FeedbackService feedbackService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions(":feedback:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = feedbackService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{feedbackid}")
    @RequiresPermissions(":feedback:info")
    public R info(@PathVariable("feedbackid") String feedbackid){
		FeedbackEntity feedback = feedbackService.getById(feedbackid);

        return R.ok().put("feedback", feedback);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions(":feedback:save")
    public R save(@RequestBody FeedbackEntity feedback){
		feedbackService.save(feedback);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions(":feedback:update")
    public R update(@RequestBody FeedbackEntity feedback){
		feedbackService.updateById(feedback);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions(":feedback:delete")
    public R delete(@RequestBody String[] feedbackids){
		feedbackService.removeByIds(Arrays.asList(feedbackids));

        return R.ok();
    }

}
