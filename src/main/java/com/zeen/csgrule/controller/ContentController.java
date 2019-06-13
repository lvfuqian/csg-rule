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

import com.zeen.csgrule.entity.ContentEntity;
import com.zeen.csgrule.service.ContentService;




/**
 * ${comments}
 *
 * @author taemin
 * @email 
 * @date 2019-06-13 11:38:09
 */
@RestController
@RequestMapping("/content")
public class ContentController {
    @Autowired
    private ContentService contentService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions(":content:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = contentService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{contentid}")
    @RequiresPermissions(":content:info")
    public R info(@PathVariable("contentid") String contentid){
		ContentEntity content = contentService.getById(contentid);

        return R.ok().put("content", content);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions(":content:save")
    public R save(@RequestBody ContentEntity content){
		contentService.save(content);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions(":content:update")
    public R update(@RequestBody ContentEntity content){
		contentService.updateById(content);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions(":content:delete")
    public R delete(@RequestBody String[] contentids){
		contentService.removeByIds(Arrays.asList(contentids));

        return R.ok();
    }

}
